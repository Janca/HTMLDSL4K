package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AlignAttributeProvider : IElement {
    var align: String?
        get() = this.getAttribute("align")
        set(value) = this.setAttribute("align", value)
}