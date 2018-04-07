package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CodeAttributeProvider : IElement {
    var code: String?
        get() = this.getAttribute("code")
        set(value) = this.setAttribute("code", value)
}