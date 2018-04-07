package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface AccessKeyAttributeProvider : IElement {

    var accesskey: String?
        get() = this.getAttribute("accesskey")
        set(value) = this.setAttribute("accesskey", value)
}