package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface RulesAttributeProvider : IElement {
    var rules: String?
        get() = this.getAttribute("ruleset")
        set(value) = this.setAttribute("ruleset", value)
}