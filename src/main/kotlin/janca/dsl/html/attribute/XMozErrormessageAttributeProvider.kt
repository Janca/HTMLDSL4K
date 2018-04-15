package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface XMozErrormessageAttributeProvider : IElement {
    var xmozerrormessage: String?
        get() = this.getAttribute("x-moz-errormessage")
        set(value) = this.setAttribute("x-moz-errormessage", value)
}