package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CellPaddingAttributeProvider : IElement {
    var cellpadding: String?
        get() = this.getAttribute("cellpadding")
        set(value) = this.setAttribute("cellpadding", value)
}