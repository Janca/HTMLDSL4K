package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface LongDescAttributeProvider : IElement {
    var longdesc: String?
        get() = this.getAttribute("longdesc")
        set(value) = this.setAttribute("longdesc", value)
}