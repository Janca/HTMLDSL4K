package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface LowAttributeProvider : IElement {
    var low: String?
        get() = this.getAttribute("low")
        set(value) = this.setAttribute("low", value)
}