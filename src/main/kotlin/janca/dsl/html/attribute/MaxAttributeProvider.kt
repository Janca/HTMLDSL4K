package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MaxAttributeProvider : IElement {
    var max: String?
        get() = this.getAttribute("max")
        set(value) = this.setAttribute("max", value)
}