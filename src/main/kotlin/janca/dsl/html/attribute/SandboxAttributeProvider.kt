package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SandboxAttributeProvider : IElement {
    var sandbox: String?
        get() = this.getAttribute("sandbox")
        set(value) = this.setAttribute("sandbox", value)
}