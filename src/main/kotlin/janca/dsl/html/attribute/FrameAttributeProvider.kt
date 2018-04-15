package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FrameAttributeProvider : IElement {
    var frame: String?
        get() = this.getAttribute("frame")
        set(value) = this.setAttribute("frame", value)
}