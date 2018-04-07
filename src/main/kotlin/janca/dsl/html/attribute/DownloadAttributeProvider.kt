package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface DownloadAttributeProvider : IElement {

    var download: String?
        get() = this.getAttribute("download")
        set(value) = this.setAttribute("download", value)
}