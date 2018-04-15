package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ColorAttributeProvider : IElement {
    var color: String?
        get() = this.getAttribute("color")
        set(value) = this.setAttribute("color", value)
}