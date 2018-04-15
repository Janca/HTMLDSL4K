package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MethodAttributeProvider : IElement {
    var method: String?
        get() = this.getAttribute("method")
        set(value) = this.setAttribute("method", value)
}