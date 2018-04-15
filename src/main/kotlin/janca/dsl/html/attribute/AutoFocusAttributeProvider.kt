package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AutoFocusAttributeProvider : IElement {
    var autofocus: String?
        get() = this.getAttribute("autofocus")
        set(value) = this.setAttribute("autofocus", value)
}