package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ShapeAttributeProvider : IElement {

    var shape: String?
        get() = this.getAttribute("shape")
        set(value) = this.setAttribute("shape", value)
}