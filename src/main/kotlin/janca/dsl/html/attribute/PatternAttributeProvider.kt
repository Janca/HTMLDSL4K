package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PatternAttributeProvider : IElement {
    var pattern: String?
        get() = this.getAttribute("pattern")
        set(value) = this.setAttribute("pattern", value)
}