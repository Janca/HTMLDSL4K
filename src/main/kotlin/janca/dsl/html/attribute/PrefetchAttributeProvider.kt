package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PrefetchAttributeProvider : IElement {
    var prefetch: String?
        get() = this.getAttribute("prefetch")
        set(value) = this.setAttribute("prefetch", value)
}