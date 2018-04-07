package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface TypeAttributeProvider : IElement {
    var type: String?
        get() = this.getAttribute("type")
        set(value) = this.setAttribute("type", value)
}