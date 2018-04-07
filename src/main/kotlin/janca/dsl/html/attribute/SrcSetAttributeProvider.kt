package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SrcSetAttributeProvider : IElement {
    var srcset: String?
        get() = this.getAttribute("srcset")
        set(value) = this.setAttribute("srcset", value)
}