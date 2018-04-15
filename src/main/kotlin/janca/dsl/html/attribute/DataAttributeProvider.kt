package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DataAttributeProvider : IElement {
    var data: String?
        get() = this.getAttribute("data")
        set(value) = this.setAttribute("data", value)
}