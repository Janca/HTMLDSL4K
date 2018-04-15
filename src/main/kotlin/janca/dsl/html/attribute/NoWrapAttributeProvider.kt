package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NoWrapAttributeProvider : IElement {
    var nowrap: String?
        get() = this.getAttribute("nowrap")
        set(value) = this.setAttribute("nowrap", value)
}