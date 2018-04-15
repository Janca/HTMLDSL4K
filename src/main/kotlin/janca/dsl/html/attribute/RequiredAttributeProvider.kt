package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RequiredAttributeProvider : IElement {
    var required: String?
        get() = this.getAttribute("required")
        set(value) = this.setAttribute("required", value)
}