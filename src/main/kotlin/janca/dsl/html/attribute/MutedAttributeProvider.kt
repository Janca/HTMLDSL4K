package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MutedAttributeProvider : IElement {
    var muted: String?
        get() = this.getAttribute("muted")
        set(value) = this.setAttribute("muted", value)
}