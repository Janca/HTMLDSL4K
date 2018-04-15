package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormAttributeProvider : IElement {
    var form: String?
        get() = this.getAttribute("form")
        set(value) = this.setAttribute("form", value)
}