package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ReferrerPolicyAttributeProvider : IElement {

    var referrerpolicy: String?
        get() = this.getAttribute("referrerpolicy")
        set(value) = this.setAttribute("referrerpolicy", value)
}