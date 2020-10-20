package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class FigureElement : EmbeddedElement("figure", false), FigCaptionElementProvider, FlowContentElementProvider
interface FigureElementProvider : IElement {
    fun figure(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (FigureElement.() -> Unit)? = null
    ) = addChild(FigureElement().init(className = className, id = id, text = text, init = init))
}