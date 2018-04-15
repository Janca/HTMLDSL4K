package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ListAttributeProvider : IElement {
    var list: String?
        get() = this.getAttribute("list")
        set(value) = this.setAttribute("list", value)
}