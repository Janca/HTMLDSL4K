package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class FigCaptionElement : EmbeddedElement("figcaption", false)
interface FigCaptionElementProvider : IElement {
    fun figcaption(className: String? = null, id: String? = null, text: String? = null, init: (FigCaptionElement.() -> Unit)? = null) = addChild(FigCaptionElement().init(className = className, id = id, text = text, init = init))
}