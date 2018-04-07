package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ControlsAttributeProvider : IElement {
    var controls: String?
        get() = this.getAttribute("controls")
        set(value) = this.setAttribute("controls", value)
}