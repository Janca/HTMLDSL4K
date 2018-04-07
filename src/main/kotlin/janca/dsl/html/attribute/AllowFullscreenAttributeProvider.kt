package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AllowFullscreenAttributeProvider : IElement {
    var allowfullscreen: String?
        get() = this.getAttribute("allowfullscreen")
        set(value) = this.setAttribute("allowfullscreen", value)
}