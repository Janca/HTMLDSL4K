package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AcceptCharsetAttributeProvider : IElement {
    var accept: String?
        get() = this.getAttribute("accept-charset")
        set(value) = this.setAttribute("accept-charset", value)
}