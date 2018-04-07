package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HeightAttributeProvider : IElement {
    var height: String?
        get() = this.getAttribute("height")
        set(value) = this.setAttribute("height", value)
}