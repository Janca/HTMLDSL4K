package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface WidthAttributeProvider : IElement {
    var width: String?
        get() = this.getAttribute("width")
        set(value) = this.setAttribute("width", value)
}