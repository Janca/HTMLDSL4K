package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface UseMapAttributeProvider : IElement {
    var usemap: String?
        get() = this.getAttribute("usemap")
        set(value) = this.setAttribute("usemap", value)
}