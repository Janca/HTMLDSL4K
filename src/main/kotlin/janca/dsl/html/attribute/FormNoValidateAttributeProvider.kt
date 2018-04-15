package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormNoValidateAttributeProvider : IElement {
    var formnovalidate: String?
        get() = this.getAttribute("formnovalidate")
        set(value) = this.setAttribute("formnovalidate", value)
}