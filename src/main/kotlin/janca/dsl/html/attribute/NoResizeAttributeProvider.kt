package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NoResizeAttributeProvider : IElement {
    var noresize: String?
        get() = this.getAttribute("noresize")
        set(value) = this.setAttribute("noresize", value)
}