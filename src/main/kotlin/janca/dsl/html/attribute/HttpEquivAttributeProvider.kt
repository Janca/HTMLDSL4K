package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HttpEquivAttributeProvider : IElement {
    var httpequiv: String?
        get() = this.getAttribute("http-equiv")
        set(value) = this.setAttribute("http-equiv", value)
}