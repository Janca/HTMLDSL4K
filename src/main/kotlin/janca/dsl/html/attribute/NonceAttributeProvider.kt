package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface NonceAttributeProvider : IElement {
    var nonce: String?
        get() = this.getAttribute("nonce")
        set(value) = this.setAttribute("nonce", value)
}