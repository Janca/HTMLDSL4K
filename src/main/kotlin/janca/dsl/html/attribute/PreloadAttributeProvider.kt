package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PreloadAttributeProvider : IElement {
    var preload: String?
        get() = this.getAttribute("preload")
        set(value) = this.setAttribute("preload", value)
}