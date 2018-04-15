package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CodeTypeAttributeProvider : IElement {
    var codetype: String?
        get() = this.getAttribute("codetype")
        set(value) = this.setAttribute("codetype", value)
}