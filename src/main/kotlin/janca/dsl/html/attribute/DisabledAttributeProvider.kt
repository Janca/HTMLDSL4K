package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DisabledAttributeProvider : IElement {
    var disabled: String?
        get() = this.getAttribute("disabled")
        set(value) = this.setAttribute("disabled", value)
}