package janca.dsl.html.element.impl.document

import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.struct.StructuralElement
import janca.dsl.html.element.init

open class HTMLElement : StructuralElement("html", false), HeadElementProvider, BodyElementProvider
interface HTMLElementProvider : IElement {
    fun html(init: HTMLElement.() -> Unit) = addChild(HTMLElement().init(init = init))
}