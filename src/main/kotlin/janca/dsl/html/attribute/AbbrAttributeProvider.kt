package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AbbrAttributeProvider : IElement {
    var abbr: String?
        get() = this.getAttribute("abbr")
        set(value) = this.setAttribute("abbr", value)
}