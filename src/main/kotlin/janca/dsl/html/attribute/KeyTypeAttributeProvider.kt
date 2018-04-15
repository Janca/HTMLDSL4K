package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface KeyTypeAttributeProvider : IElement {
    var keytype: String?
        get() = this.getAttribute("keytype")
        set(value) = this.setAttribute("keytype", value)
}