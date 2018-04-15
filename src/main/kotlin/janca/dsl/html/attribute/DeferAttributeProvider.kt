package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DeferAttributeProvider : IElement {
    var defer: String?
        get() = this.getAttribute("defer")
        set(value) = this.setAttribute("defer", value)
}