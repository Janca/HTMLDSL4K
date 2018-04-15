package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormTargetAttributeProvider : IElement {
    var formtarget: String?
        get() = this.getAttribute("formtarget")
        set(value) = this.setAttribute("formtarget", value)
}