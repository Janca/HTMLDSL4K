package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface TargetAttributeProvider : IElement {

    var target: String?
        get() = this.getAttribute("target")
        set(value) = this.setAttribute("target", value)
}