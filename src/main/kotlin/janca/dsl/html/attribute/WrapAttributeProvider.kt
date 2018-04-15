package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface WrapAttributeProvider : IElement {
    var wrap: String?
        get() = this.getAttribute("wrap")
        set(value) = this.setAttribute("wrap", value)
}