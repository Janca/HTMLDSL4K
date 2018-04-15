package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface WebKitDirectoryAttributeProvider : IElement {
    var webkitdirectory: String?
        get() = this.getAttribute("webkitdirectory")
        set(value) = this.setAttribute("webkitdirectory", value)
}