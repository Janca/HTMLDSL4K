package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DecodingAttributeProvider : IElement {
    var decoding: String?
        get() = this.getAttribute("decoding")
        set(value) = this.setAttribute("decoding", value)
}