package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.MediaAttributeProvider
import janca.dsl.html.attribute.NonceAttributeProvider
import janca.dsl.html.attribute.ScopeAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.ElementDsl
import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.meta.css.CSSMediaRule
import janca.dsl.html.element.impl.meta.css.CSSRule
import janca.dsl.html.element.impl.meta.css.CSSRuleSet
import janca.dsl.html.element.impl.meta.css.ruleset
import janca.dsl.html.element.impl.meta.css.selector
import janca.dsl.html.element.init
import java.io.InputStream

open class StyleElement : MetadataElement("style", false),
    TypeAttributeProvider,
    MediaAttributeProvider,
    ScopeAttributeProvider,
    NonceAttributeProvider {
    companion object {

        private fun buildRule(rule: CSSRule, properties: (CSSRule.() -> Unit)? = null): String {
            properties?.invoke(rule)

            val rulesBuilder = StringBuilder()
            rule.ruleset.forEach { (key, value) ->
                rulesBuilder.append(key)
                when {
                    value.isNotBlank() -> {
                        rulesBuilder.append(":").append(value)
                        if (!value.endsWith(";")) {
                            rulesBuilder.append(";")
                        }
                    }

                    !key.endsWith(";") -> rulesBuilder.append(";")
                }
            }

            return "${rule.selector}{$rulesBuilder}"
        }

    }

    private fun addRule(rule: CSSRule, properties: (CSSRule.() -> Unit)) {
        text(buildRule(rule, properties))
    }

    @ElementDsl
    fun media(selector: String, properties: CSSMediaRule.() -> Unit) {
        val media = if (selector.startsWith("@")) {
            selector
        } else {
            "@media $selector"
        }

        val cssRules = ArrayList<CSSRule>()
        val mediaRule = CSSMediaRule(selector, cssRules)

        properties.invoke(mediaRule)

        val nested = buildString {
            cssRules.forEach {
                if (it.second.isNotEmpty()) {
                    append(buildRule(it))
                }
            }
        }

        text("$media{$nested}")
    }

    @ElementDsl
    fun addRule(selector: String, properties: (CSSRule.() -> Unit)) {
        val rule = CSSRule(selector, CSSRuleSet())
        addRule(rule, properties)
    }

    fun CSSRule.nest(selector: String, properties: (CSSRule.() -> Unit)) {
        val rule = CSSRule("${this.selector} $selector", CSSRuleSet())
        addRule(rule, properties)
    }

    fun CSSRule.finer(selector: String, properties: CSSRule.() -> Unit) {
        bem(selector, properties)
    }

    fun CSSRule.pseudo(selector: String, properties: CSSRule.() -> Unit) {
        val pseudo = if (selector.startsWith(":")) {
            selector
        } else {
            ":$selector"
        }

        bem(pseudo, properties)
    }

    fun CSSRule.bem(selector: String, properties: CSSRule.() -> Unit) {
        val rule = CSSRule("${this.selector}$selector", CSSRuleSet())
        addRule(rule, properties)
    }

    fun CSSRule.media(selector: String, properties: CSSRule.() -> Unit) {
        val media = if (selector.startsWith("@")) {
            selector
        } else {
            "@media $selector"
        }

        val rule = CSSRule(this.selector, CSSRuleSet())
        text("$media{${buildRule(rule, properties)}}")
    }
}

interface StyleElementProvider : IElement {
    fun style(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (StyleElement.() -> Unit)? = null
    ) = addChild(StyleElement().init(className = className, id = id, text = text, init = init))

    fun style(resourceStream: InputStream) = style(text = resourceStream.use {
        it.readAllBytes().toString(Charsets.UTF_8)
    })
}