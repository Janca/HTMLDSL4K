package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface BgColorAttributeProvider : IElement {
    var bgcolor: String?
        get() = this.getAttribute("bgcolor")
        set(value) = this.setAttribute("bgcolor", value)
}