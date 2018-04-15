package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SelectedAttributeProvider : IElement {
    var selected: String?
        get() = this.getAttribute("selected")
        set(value) = this.setAttribute("selected", value)
}