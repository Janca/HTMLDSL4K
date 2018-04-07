package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MarginWidthAttributeProvider : IElement {
    var marginwidth: String?
        get() = this.getAttribute("marginwidth")
        set(value) = this.setAttribute("marginwidth", value)
}