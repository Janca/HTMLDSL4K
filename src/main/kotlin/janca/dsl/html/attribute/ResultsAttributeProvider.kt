package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ResultsAttributeProvider : IElement {
    var results: String?
        get() = this.getAttribute("results")
        set(value) = this.setAttribute("results", value)
}