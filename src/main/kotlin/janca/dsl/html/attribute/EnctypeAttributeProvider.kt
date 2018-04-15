package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface EnctypeAttributeProvider : IElement {
    var enctype: String?
        get() = this.getAttribute("enctype")
        set(value) = this.setAttribute("enctype", value)
}