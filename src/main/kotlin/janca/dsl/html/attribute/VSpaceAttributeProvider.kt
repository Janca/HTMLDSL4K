package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface VSpaceAttributeProvider : IElement {
    var vspace: String?
        get() = this.getAttribute("vspace")
        set(value) = this.setAttribute("vspace", value)
}