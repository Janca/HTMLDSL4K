package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ArchiveAttributeProvider : IElement {

    var archive: String?
        get() = this.getAttribute("archive")
        set(value) = this.setAttribute("archive", value)
}