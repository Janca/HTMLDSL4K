package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SubscriptElement : FormattingElement("sub", false)
interface SubscriptElementProvider : IElement {
    fun sub(className: String? = null, id: String? = null, text: String? = null, init: (SubscriptElement.() -> Unit)? = null) = addChild(SubscriptElement().init(className = className, id = id, text = text, init = init))
}