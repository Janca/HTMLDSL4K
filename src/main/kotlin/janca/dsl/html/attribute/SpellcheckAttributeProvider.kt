package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface SpellcheckAttributeProvider : IElement {
    var spellcheck: String?
        get() = this.getAttribute("spellcheck")
        set(value) = this.setAttribute("spellcheck", value)
}