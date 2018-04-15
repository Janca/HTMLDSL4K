package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AxisAttributeProvider : IElement {
    var axis: String?
        get() = this.getAttribute("axis")
        set(value) = this.setAttribute("axis", value)
}