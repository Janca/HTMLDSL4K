package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DefaultAttributeProvider : IElement {
    var default: String?
        get() = this.getAttribute("default")
        set(value) = this.setAttribute("default", value)
}