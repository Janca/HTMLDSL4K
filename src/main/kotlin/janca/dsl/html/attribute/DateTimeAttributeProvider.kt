package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DateTimeAttributeProvider : IElement {
    var datetime: String?
        get() = this.getAttribute("datetime")
        set(value) = this.setAttribute("datetime", value)
}