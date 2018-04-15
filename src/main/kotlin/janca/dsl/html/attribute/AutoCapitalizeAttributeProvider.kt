package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AutoCapitalizeAttributeProvider : IElement {
    var autocapitalize: String?
        get() = this.getAttribute("autocapitalize")
        set(value) = this.setAttribute("autocapitalize", value)
}