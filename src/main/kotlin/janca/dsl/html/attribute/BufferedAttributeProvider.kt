package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface BufferedAttributeProvider : IElement {
    var buffered: String?
        get() = this.getAttribute("buffered")
        set(value) = this.setAttribute("buffered", value)
}