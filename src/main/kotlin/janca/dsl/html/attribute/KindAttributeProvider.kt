package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface KindAttributeProvider : IElement {
    var kind: String?
        get() = this.getAttribute("kind")
        set(value) = this.setAttribute("kind", value)
}