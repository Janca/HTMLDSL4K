package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface MozActionHintAttributeProvider : IElement {
    var mozactionhint: String?
        get() = this.getAttribute("mozactionhint")
        set(value) = this.setAttribute("mozactionhint", value)
}