package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RevAttributeProvider : IElement {
    var rev: String?
        get() = this.getAttribute("rev")
        set(value) = this.setAttribute("rev", value)
}