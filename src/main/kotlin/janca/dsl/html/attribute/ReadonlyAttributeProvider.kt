package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ReadonlyAttributeProvider : IElement {
    var readonly: String?
        get() = this.getAttribute("readonly")
        set(value) = this.setAttribute("readonly", value)
}