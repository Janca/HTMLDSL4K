package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface IncrementalAttributeProvider : IElement {
    var incremental: String?
        get() = this.getAttribute("incremental")
        set(value) = this.setAttribute("incremental", value)
}