package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DataFldAttributeProvider : IElement {
    var datafld: String?
        get() = this.getAttribute("datafld")
        set(value) = this.setAttribute("datafld", value)
}