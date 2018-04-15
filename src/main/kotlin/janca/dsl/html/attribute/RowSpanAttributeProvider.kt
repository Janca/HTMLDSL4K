package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RowSpanAttributeProvider : IElement {
    var rowspan: String?
        get() = this.getAttribute("rowspan")
        set(value) = this.setAttribute("rowspan", value)
}