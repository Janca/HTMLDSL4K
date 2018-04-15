package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AutoCompleteAttributeProvider : IElement {
    var autocomplete: String?
        get() = this.getAttribute("autocomplete")
        set(value) = this.setAttribute("autocomplete", value)
}