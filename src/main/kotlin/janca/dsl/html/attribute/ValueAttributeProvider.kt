package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ValueAttributeProvider : IElement {
    var value: String?
        get() = this.getAttribute("value")
        set(value) = this.setAttribute("value", value)
}