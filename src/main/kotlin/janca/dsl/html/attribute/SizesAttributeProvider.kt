package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SizesAttributeProvider : IElement {
    var sizes: String?
        get() = this.getAttribute("sizes")
        set(value) = this.setAttribute("sizes", value)
}