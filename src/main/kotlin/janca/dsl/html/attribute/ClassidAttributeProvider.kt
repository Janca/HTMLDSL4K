package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ClassidAttributeProvider : IElement {
    var classid: String?
        get() = this.getAttribute("classid")
        set(value) = this.setAttribute("classid", value)
}