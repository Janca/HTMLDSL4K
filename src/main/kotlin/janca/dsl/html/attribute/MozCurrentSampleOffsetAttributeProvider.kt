package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MozCurrentSampleOffsetAttributeProvider : IElement {
    var mozCurrentSampleOffset: String?
        get() = this.getAttribute("mozCurrentSampleOffset")
        set(value) = this.setAttribute("mozCurrentSampleOffset", value)
}