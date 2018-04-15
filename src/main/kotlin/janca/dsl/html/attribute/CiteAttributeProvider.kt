package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CiteAttributeProvider : IElement {
    var cite: String?
        get() = this.getAttribute("cite")
        set(value) = this.setAttribute("cite", value)
}