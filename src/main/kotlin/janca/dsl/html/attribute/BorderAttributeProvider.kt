package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface BorderAttributeProvider : IElement {
    var border: String?
        get() = this.getAttribute("border")
        set(value) = this.setAttribute("border", value)
}