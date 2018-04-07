package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CodeBaseAttributeProvider : IElement {

    var codebase: String?
        get() = this.getAttribute("codebase")
        set(value) = this.setAttribute("codebase", value)
}