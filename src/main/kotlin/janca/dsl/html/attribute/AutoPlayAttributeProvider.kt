package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AutoPlayAttributeProvider : IElement {
    var autoplay: String?
        get() = this.getAttribute("autoplay")
        set(value) = this.setAttribute("autoplay", value)
}