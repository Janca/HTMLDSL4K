package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RoleAttributeProvider : IElement {

    var role: String?
        get() = getAttribute("role")
        set(value) = setAttribute("role", value)
}