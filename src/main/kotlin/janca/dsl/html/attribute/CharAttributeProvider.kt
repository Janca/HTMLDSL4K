package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CharAttributeProvider : IElement {
    var char: String?
        get() = this.getAttribute("char")
        set(value) = this.setAttribute("char", value)
}