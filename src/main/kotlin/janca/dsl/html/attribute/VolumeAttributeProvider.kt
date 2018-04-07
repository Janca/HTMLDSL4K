package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface VolumeAttributeProvider : IElement {
    var volume: String?
        get() = this.getAttribute("volume")
        set(value) = this.setAttribute("volume", value)
}