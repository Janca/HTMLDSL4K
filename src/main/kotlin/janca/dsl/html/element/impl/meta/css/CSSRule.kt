package janca.dsl.html.element.impl.meta.css

typealias CSSRule = Pair<String, CSSRuleSet>
typealias CSSRuleSet = HashMap<String, String>

val CSSRule.selector: String get() = this.first
val CSSRule.ruleset: CSSRuleSet get() = this.second

fun CSSRule.put(key: String, value: String, important: Boolean = false): CSSRule {
    ruleset[key.trim()] = if (important) {
        "${value.trim()}!important"
    } else {
        value.trim()
    }

    return this
}

fun CSSRule.put(rule: String, important: Boolean = false): CSSRule {
    val key = rule.substringBefore(':').trim()
    val value = rule.substringAfter(':').trim()
    put(key, value, important)
    return this
}

operator fun CSSRule.plusAssign(rule: Pair<String, String>) {
    put(rule.first, rule.second)
}

operator fun CSSRule.plus(rule: Pair<String, String>) {
    put(rule.first, rule.second)
}