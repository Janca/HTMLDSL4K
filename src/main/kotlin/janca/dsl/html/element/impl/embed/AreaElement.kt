package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class AreaElement : EmbeddedElement("area", true)
interface AreaElementProvider : IElement {
    fun area(className: String? = null, id: String? = null, text: String? = null, init: (AreaElement.() -> Unit)? = null) = addChild(AreaElement().init(className = className, id = id, text = text, init = init))
}