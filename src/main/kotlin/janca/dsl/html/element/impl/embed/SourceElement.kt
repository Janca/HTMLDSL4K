package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SourceElement : EmbeddedElement("source", false)
interface SourceElementProvider : IElement {
    fun source(className: String? = null, id: String? = null, text: String? = null, init: (SourceElement.() -> Unit)? = null) = addChild(SourceElement().init(className = className, id = id, text = text, init = init))
}