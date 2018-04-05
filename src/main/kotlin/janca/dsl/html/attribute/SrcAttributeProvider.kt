package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SrcAttributeProvider : IElement {
    var src: String?
        get() = this.getAttribute("src")
        set(value) = this.setAttribute("src", value)
}