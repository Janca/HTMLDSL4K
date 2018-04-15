package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface LabelAttributeProvider : IElement {
    var label: String?
        get() = this.getAttribute("label")
        set(value) = this.setAttribute("label", value)
}