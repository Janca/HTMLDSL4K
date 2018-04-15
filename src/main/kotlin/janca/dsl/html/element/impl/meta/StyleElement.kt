package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.MediaAttributeProvider
import janca.dsl.html.attribute.NonceAttributeProvider
import janca.dsl.html.attribute.ScopeAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.ElementDsl
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

typealias CSSRule = Pair<String, CSSRuleSet>
typealias CSSRuleSet = HashMap<String, String>

val CSSRule.selector: String get() = this.first
val CSSRule.ruleset: CSSRuleSet get() = this.second

fun CSSRule.put(key: String, value: String) {
    ruleset[key] = value
}

open class StyleElement : MetadataElement("style", false),
        TypeAttributeProvider,
        MediaAttributeProvider,
        ScopeAttributeProvider,
        NonceAttributeProvider {

    private fun addRule(rule: CSSRule, properties: (@ElementDsl CSSRule.() -> Unit)) {
        properties.invoke(rule)

        val rulesBuilder = StringBuilder()
        rule.ruleset.forEach { key, value -> rulesBuilder.append(key).append(":").append(value).append(";") }

        text("${rule.selector}{$rulesBuilder}")
    }

    @ElementDsl
    fun addRule(selector: String, properties: (@ElementDsl CSSRule.() -> Unit)) {
        val rule = CSSRule(selector, CSSRuleSet())
        addRule(rule, properties)
    }

    @ElementDsl
    fun CSSRule.finer(selector: String, properties: (@ElementDsl CSSRule.() -> Unit)) {
        val rule = CSSRule(this.selector + selector, CSSRuleSet())
        addRule(rule, properties)
    }

}

interface StyleElementProvider : IElement {
    fun style(className: String? = null, id: String? = null, text: String? = null, init: (StyleElement.() -> Unit)? = null) = addChild(StyleElement().init(className = className, id = id, text = text, init = init))
}