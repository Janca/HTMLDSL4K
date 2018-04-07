package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AltAttributeProvider : IElement {
    var alt: String?
        get() = this.getAttribute("alt")
        set(value) = this.setAttribute("alt", value)
}