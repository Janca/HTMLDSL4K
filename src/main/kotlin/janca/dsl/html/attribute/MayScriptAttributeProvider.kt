package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MayScriptAttributeProvider : IElement {
    var mayscript: String?
        get() = this.getAttribute("mayscript")
        set(value) = this.setAttribute("mayscript", value)
}