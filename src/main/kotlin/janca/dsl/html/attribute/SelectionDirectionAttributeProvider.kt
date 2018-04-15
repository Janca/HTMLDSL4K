package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SelectionDirectionAttributeProvider : IElement {
    var selectionDirection: String?
        get() = this.getAttribute("selectionDirection")
        set(value) = this.setAttribute("selectionDirection", value)
}