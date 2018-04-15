package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormEncTypeAttributeProvider : IElement {
    var formenctype: String?
        get() = this.getAttribute("formenctype")
        set(value) = this.setAttribute("formenctype", value)
}