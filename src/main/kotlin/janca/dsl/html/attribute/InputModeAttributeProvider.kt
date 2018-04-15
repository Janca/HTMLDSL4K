package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface InputModeAttributeProvider : IElement {
    var inputmode: String?
        get() = this.getAttribute("inputmode")
        set(value) = this.setAttribute("inputmode", value)
}