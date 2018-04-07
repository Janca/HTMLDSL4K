package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ObjectAttributeProvider : IElement {
    var objectAttr: String?
        get() = this.getAttribute("object")
        set(value) = this.setAttribute("object", value)
}