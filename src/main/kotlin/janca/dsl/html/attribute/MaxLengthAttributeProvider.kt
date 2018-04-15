package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MaxLengthAttributeProvider : IElement {
    var maxlength: String?
        get() = this.getAttribute("maxlength")
        set(value) = this.setAttribute("maxlength", value)
}