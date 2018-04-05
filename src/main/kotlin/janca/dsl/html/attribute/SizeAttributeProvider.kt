package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SizeAttributeProvider : IElement {
    var width: String?
        get() = this.getAttribute("width")
        set(value) = this.setAttribute("width", value)

    var height: String?
        get() = this.getAttribute("height")
        set(value) = this.setAttribute("height", height)
}