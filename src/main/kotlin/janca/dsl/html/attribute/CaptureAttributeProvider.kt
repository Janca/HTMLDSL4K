package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CaptureAttributeProvider : IElement {
    var capture: String?
        get() = this.getAttribute("capture")
        set(value) = this.setAttribute("capture", value)
}