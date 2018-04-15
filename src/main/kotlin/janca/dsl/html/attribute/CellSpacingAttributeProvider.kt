package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CellSpacingAttributeProvider : IElement {
    var cellspacing: String?
        get() = this.getAttribute("cellspacing")
        set(value) = this.setAttribute("cellspacing", value)
}