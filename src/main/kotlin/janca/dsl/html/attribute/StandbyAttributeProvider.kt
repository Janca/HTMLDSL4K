package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface StandbyAttributeProvider : IElement {
    var standby: String?
        get() = this.getAttribute("standby")
        set(value) = this.setAttribute("standby", value)
}