package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RowsAttributeProvider : IElement {
    var rows: String?
        get() = this.getAttribute("rows")
        set(value) = this.setAttribute("rows", value)
}