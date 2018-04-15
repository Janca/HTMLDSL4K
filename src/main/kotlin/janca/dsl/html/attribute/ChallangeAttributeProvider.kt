package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ChallangeAttributeProvider : IElement {
    var challange: String?
        get() = this.getAttribute("challange")
        set(value) = this.setAttribute("challange", value)
}