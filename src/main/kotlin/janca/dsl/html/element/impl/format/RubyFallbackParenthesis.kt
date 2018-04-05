package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class RubyFallbackParenthesis : FormattingElement("rp", false)
interface RubyFallbackParenthesisProvider : IElement {
    fun rp(className: String? = null, id: String? = null, text: String? = null, init: RubyFallbackParenthesis.() -> Unit = {}) = addChild(RubyFallbackParenthesis().init(className = className, id = id, text = text, init = init))
}