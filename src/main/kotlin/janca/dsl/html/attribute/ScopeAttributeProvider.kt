package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ScopeAttributeProvider : IElement {
    var scope: String?
        get() = this.getAttribute("scope")
        set(value) = this.setAttribute("scope", value)
}