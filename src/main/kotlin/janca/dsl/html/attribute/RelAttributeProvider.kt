package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RelAttributeProvider : IElement {
    var rel: String?
        get() = this.getAttribute("rel")
        set(value) = this.setAttribute("rel", value)
}