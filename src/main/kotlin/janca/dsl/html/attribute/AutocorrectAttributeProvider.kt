package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AutocorrectAttributeProvider : IElement {
    var autocorrect: String?
        get() = this.getAttribute("autocorrect")
        set(value) = this.setAttribute("autocorrect", value)
}