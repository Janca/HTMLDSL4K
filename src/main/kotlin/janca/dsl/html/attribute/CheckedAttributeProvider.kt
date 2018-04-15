package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface CheckedAttributeProvider : IElement {
    var checked: String?
        get() = this.getAttribute("checked")
        set(value) = this.setAttribute("checked", value)
}