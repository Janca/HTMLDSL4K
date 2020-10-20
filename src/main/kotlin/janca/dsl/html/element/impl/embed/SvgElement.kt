package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SvgElement : EmbeddedElement("svg", false)//TODO PATH
interface SvgElementProvider : IElement {
    fun svg(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (SvgElement.() -> Unit)? = null
    ) = addChild(SvgElement().init(className = className, id = id, text = text, init = init))
}