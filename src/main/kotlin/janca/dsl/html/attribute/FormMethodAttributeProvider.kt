package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface FormMethodAttributeProvider : IElement {
    var formmethod: String?
        get() = this.getAttribute("formmethod")
        set(value) = this.setAttribute("formmethod", value)
}