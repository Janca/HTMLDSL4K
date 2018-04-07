package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface TabIndexAttributeProvider : IElement {

    var tabindex: String?
        get() = this.getAttribute("tabindex")
        set(value) = this.setAttribute("tabindex", value)
}