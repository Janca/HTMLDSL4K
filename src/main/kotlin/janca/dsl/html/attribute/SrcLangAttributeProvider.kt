package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SrcLangAttributeProvider : IElement {
    var srclang: String?
        get() = this.getAttribute("srclang")
        set(value) = this.setAttribute("srclang", value)
}