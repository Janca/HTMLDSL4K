package janca.dsl.html.element.impl.meta.css

typealias CSSMediaRule = Pair<String, MutableList<CSSRule>>
typealias CSSMediaRuleChild = Pair<CSSMediaRule, CSSRule>


val CSSMediaRule.rules: List<CSSRule> get() = this.second

fun CSSMediaRule.addRule(selector: String, properties: CSSMediaRuleChild.() -> Unit) {
    val rule = CSSRule(selector, CSSRuleSet())
    val child = CSSMediaRuleChild(this, rule)
    properties.invoke(child)
    second.add(rule)
}

fun CSSMediaRuleChild.bem(selector: String, properties: CSSRule.() -> Unit) {
    this.first.addRule("${this.second.first}$selector") {
        properties.invoke(this.second)
    }
}

fun CSSMediaRuleChild.finer(selector: String, properties: CSSRule.() -> Unit) {
    bem(selector, properties)
}

fun CSSMediaRuleChild.put(key: String, value: String) {
    this.second.put(key, value)
}

fun CSSMediaRuleChild.put(rule: String) {
    this.second.put(rule)
}

fun CSSMediaRuleChild.nest(selector: String, properties: CSSRule.() -> Unit) {
    this.first.addRule("${this.second.first} $selector") {
        properties.invoke(this.second)
    }
}