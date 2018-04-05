package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class RubyTextElement : FormattingElement("rt", false), PhrasingContentElementProvider
interface RubyTextElementProvider : IElement {
    fun rt(className: String? = null, id: String? = null, text: String? = null, init: (RubyTextElement.() -> Unit)? = null) = addChild(RubyTextElement().init(className = className, id = id, text = text, init = init))
}