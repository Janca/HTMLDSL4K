package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PlayedAttributeProvider : IElement {
    var played: String?
        get() = this.getAttribute("played")
        set(value) = this.setAttribute("played", value)
}