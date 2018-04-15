package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HighAttributeProvider : IElement {
    var high: String?
        get() = this.getAttribute("high")
        set(value) = this.setAttribute("high", value)
}