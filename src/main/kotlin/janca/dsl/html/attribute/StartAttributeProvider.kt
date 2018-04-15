package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface StartAttributeProvider : IElement {
    var start: String?
        get() = this.getAttribute("start")
        set(value) = this.setAttribute("start", value)
}