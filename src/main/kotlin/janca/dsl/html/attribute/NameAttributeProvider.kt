package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NameAttributeProvider : IElement {
    var name: String?
        get() = this.getAttribute("name")
        set(value) = this.setAttribute("name", value)
}