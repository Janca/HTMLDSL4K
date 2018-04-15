package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HeadersAttributeProvider : IElement {
    var headers: String?
        get() = this.getAttribute("headers")
        set(value) = this.setAttribute("headers", value)
}