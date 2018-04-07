package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SrcDocAttributeProvider : IElement {
    var srcdoc: String?
        get() = this.getAttribute("srcdoc")
        set(value) = this.setAttribute("srcdoc", value)
}