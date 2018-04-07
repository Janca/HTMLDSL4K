package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CoordsAttributeProvider : IElement {

    var coords: String?
        get() = this.getAttribute("coords")
        set(value) = this.setAttribute("coords", value)
}