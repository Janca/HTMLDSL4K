package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface PosterAttributeProvider : IElement {
    var poster: String?
        get() = this.getAttribute("poster")
        set(value) = this.setAttribute("poster", value)
}