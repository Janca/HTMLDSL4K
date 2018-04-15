package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PlaceholderAttributeProvider : IElement {
    var placeholder: String?
        get() = this.getAttribute("placeholder")
        set(value) = this.setAttribute("placeholder", value)
}