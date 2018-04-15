package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CompactAttributeProvider : IElement {
    var compact: String?
        get() = this.getAttribute("compact")
        set(value) = this.setAttribute("compact", value)
}