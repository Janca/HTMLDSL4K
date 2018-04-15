package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ForAttributeProvider : IElement {
    var forAttr: String?
        get() = this.getAttribute("for")
        set(value) = this.setAttribute("for", value)
}