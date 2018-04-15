package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MethodsAttributeProvider : IElement {
    var methods: String?
        get() = this.getAttribute("methods")
        set(value) = this.setAttribute("methods", value)
}