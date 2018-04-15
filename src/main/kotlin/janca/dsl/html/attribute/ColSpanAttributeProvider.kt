package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ColSpanAttributeProvider : IElement {
    var colspan: String?
        get() = this.getAttribute("colspan")
        set(value) = this.setAttribute("colspan", value)
}