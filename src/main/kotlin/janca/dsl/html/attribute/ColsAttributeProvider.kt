package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ColsAttributeProvider : IElement {
    var cols: String?
        get() = this.getAttribute("cols")
        set(value) = this.setAttribute("cols", value)
}