package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface StepAttributeProvider : IElement {
    var step: String?
        get() = this.getAttribute("step")
        set(value) = this.setAttribute("step", value)
}