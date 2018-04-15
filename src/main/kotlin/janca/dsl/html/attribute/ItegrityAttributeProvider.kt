package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ItegrityAttributeProvider : IElement {
    var itegrity: String?
        get() = this.getAttribute("itegrity")
        set(value) = this.setAttribute("itegrity", value)
}