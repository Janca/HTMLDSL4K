package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HSpaceAttributeProvider : IElement {
    var hspace: String?
        get() = this.getAttribute("hspace")
        set(value) = this.setAttribute("hspace", value)
}