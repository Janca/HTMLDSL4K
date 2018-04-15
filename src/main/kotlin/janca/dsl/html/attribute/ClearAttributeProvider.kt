package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ClearAttributeProvider : IElement {
    var clear: String?
        get() = this.getAttribute("clear")
        set(value) = this.setAttribute("clear", value)
}