package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class EmbedElement : EmbeddedElement("embed", false)
interface EmbedElementProvider : IElement {
    fun embed(className: String? = null, id: String? = null, text: String? = null, init: (EmbedElement.() -> Unit)? = null) = addChild(EmbedElement().init(className = className, id = id, text = text, init = init))
}