package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PlaysInlineAttributeProvider : IElement {
    var playsinline: String?
        get() = this.getAttribute("playsinline")
        set(value) = this.setAttribute("playsinline", value)
}