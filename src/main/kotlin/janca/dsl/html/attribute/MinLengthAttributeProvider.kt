package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MinLengthAttributeProvider : IElement {
    var minlength: String?
        get() = this.getAttribute("minlength")
        set(value) = this.setAttribute("minlength", value)
}