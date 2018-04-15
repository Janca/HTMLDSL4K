package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NoValidateAttributeProvider : IElement {
    var novalidate: String?
        get() = this.getAttribute("novalidate")
        set(value) = this.setAttribute("novalidate", value)
}