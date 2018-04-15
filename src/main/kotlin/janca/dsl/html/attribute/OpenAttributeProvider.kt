package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface OpenAttributeProvider : IElement {
    var open: String?
        get() = this.getAttribute("open")
        set(value) = this.setAttribute("open", value)
}