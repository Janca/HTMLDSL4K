package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MediaAttributeProvider : IElement {

    var media: String?
        get() = this.getAttribute("media")
        set(value) = this.setAttribute("media", value)
}