package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ContentAttributeProvider : IElement {
    var content: String?
        get() = this.getAttribute("content")
        set(value) = this.setAttribute("content", value)
}