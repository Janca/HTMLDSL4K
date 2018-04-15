package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MinAttributeProvider : IElement {
    var min: String?
        get() = this.getAttribute("min")
        set(value) = this.setAttribute("min", value)
}