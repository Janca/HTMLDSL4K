package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SelectionStartAttributeProvider : IElement {
    var selectionStart: String?
        get() = this.getAttribute("selectionStart")
        set(value) = this.setAttribute("selectionStart", value)
}