package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface HrefAttributeProvider : IElement {
    var hrefAttr: String?
        get() = this.getAttribute("href")
        set(value) = this.setAttribute("href", value)

    var xlinkShow: String?
        get() = this.getAttribute("xlink:show")
        set(value) = this.setAttribute("xlink:show", value)


    var xlinkActuate: String?
        get() = this.getAttribute("xlink:actuate")
        set(value) = this.setAttribute("xlink:actuate", value)


    var xlinkHref: String?
        get() = this.getAttribute("xlink:hrefAttr")
        set(value) = this.setAttribute("xlink:hrefAttr", value)

    var noHref: String?
        get() = this.getAttribute("nohref")
        set(value) = this.setAttribute("nohref", value)
}