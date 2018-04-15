package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface OptimumAttributeProvider : IElement {
    var optimum: String?
        get() = this.getAttribute("optimum")
        set(value) = this.setAttribute("optimum", value)
}