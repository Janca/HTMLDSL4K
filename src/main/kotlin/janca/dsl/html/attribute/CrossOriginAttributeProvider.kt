package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CrossOriginAttributeProvider : IElement {
    var crossorigin: String?
        get() = this.getAttribute("crossorigin")
        set(value) = this.setAttribute("crossorigin", value)
}