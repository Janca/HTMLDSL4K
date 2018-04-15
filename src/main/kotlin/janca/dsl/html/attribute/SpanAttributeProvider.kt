package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SpanAttributeProvider : IElement {
    var span: String?
        get() = this.getAttribute("span")
        set(value) = this.setAttribute("span", value)
}