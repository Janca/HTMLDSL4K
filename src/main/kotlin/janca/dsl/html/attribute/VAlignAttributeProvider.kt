package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface VAlignAttributeProvider : IElement {
    var valign: String?
        get() = this.getAttribute("valign")
        set(value) = this.setAttribute("valign", value)
}