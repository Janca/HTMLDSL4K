package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AcceptAttributeProvider : IElement {
    var acceptAttr: String?
        get() = this.getAttribute("accept")
        set(value) = this.setAttribute("accept", value)
}