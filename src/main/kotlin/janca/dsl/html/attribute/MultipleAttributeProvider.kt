package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MultipleAttributeProvider : IElement {
    var multiple: String?
        get() = this.getAttribute("multiple")
        set(value) = this.setAttribute("multiple", value)
}