package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SelectionEndAttributeProvider : IElement {
    var selectionEnd: String?
        get() = this.getAttribute("selectionEnd")
        set(value) = this.setAttribute("selectionEnd", value)
}