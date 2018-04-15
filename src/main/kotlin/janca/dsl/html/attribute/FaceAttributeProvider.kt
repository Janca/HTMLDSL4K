package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FaceAttributeProvider : IElement {
    var face: String?
        get() = this.getAttribute("face")
        set(value) = this.setAttribute("face", value)
}