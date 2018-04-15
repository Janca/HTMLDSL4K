package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormActionAttributeProvider : IElement {
    var formaction: String?
        get() = this.getAttribute("formaction")
        set(value) = this.setAttribute("formaction", value)
}