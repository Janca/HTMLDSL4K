package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface LoopAttributeProvider : IElement {
    var loop: String?
        get() = this.getAttribute("loop")
        set(value) = this.setAttribute("loop", value)
}