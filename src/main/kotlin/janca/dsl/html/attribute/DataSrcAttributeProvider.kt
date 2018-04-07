package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DataSrcAttributeProvider : IElement {
    var datasrc: String?
        get() = this.getAttribute("datasrc")
        set(value) = this.setAttribute("datasrc", value)
}