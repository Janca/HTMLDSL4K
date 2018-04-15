package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SummaryAttributeProvider : IElement {
    var summary: String?
        get() = this.getAttribute("summary")
        set(value) = this.setAttribute("summary", value)
}












