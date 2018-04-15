package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SizeAttributeProvider : IElement {
    var size: String?
        get() = this.getAttribute("size")
        set(value) = this.setAttribute("size", value)
}