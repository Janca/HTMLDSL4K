package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class StrongElement : FormattingElement("strong", false)
interface StrongElementProvider : IElement {
    fun strong(text: String? = null, className: String? = null, id: String? = null, init: (StrongElement.() -> Unit)? = null) = addChild(StrongElement().init(className = className, id = id, text = text, init = init))
}