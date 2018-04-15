package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CharOffAttributeProvider : IElement {
    var charoff: String?
        get() = this.getAttribute("charoff")
        set(value) = this.setAttribute("charoff", value)
}