package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface IsMapAttributeProvider : IElement {
    var ismap: String?
        get() = this.getAttribute("ismap")
        set(value) = this.setAttribute("ismap", value)
}