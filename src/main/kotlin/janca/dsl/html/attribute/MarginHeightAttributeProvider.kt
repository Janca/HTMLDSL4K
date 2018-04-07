package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MarginHeightAttributeProvider : IElement {
    var marginheight: String?
        get() = this.getAttribute("marginheight")
        set(value) = this.setAttribute("marginheight", value)
}