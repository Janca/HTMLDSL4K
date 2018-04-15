package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CharsetAttributeProvider : IElement {
    var charset: String?
        get() = this.getAttribute("charset")
        set(value) = this.setAttribute("charset", value)
}