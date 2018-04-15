package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DeclareAttributeProvider : IElement {
    var declare: String?
        get() = this.getAttribute("declare")
        set(value) = this.setAttribute("declare", value)
}