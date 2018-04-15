package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ValueTypeAttributeProvider : IElement {
    var valuetype: String?
        get() = this.getAttribute("valuetype")
        set(value) = this.setAttribute("valuetype", value)
}