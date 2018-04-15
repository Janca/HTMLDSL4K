package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NoShadeAttributeProvider : IElement {
    var noshade: String?
        get() = this.getAttribute("noshade")
        set(value) = this.setAttribute("noshade", value)
}