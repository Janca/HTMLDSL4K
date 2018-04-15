package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ReversedAttributeProvider : IElement {
    var reversed: String?
        get() = this.getAttribute("reversed")
        set(value) = this.setAttribute("reversed", value)
}