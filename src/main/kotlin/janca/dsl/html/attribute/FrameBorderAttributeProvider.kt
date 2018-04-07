package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FrameBorderAttributeProvider : IElement {
    var frameborder: String?
        get() = this.getAttribute("frameborder")
        set(value) = this.setAttribute("frameborder", value)
}