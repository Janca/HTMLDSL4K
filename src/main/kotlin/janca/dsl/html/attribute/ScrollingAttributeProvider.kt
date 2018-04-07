package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface ScrollingAttributeProvider : IElement {
    var scrolling: String?
        get() = this.getAttribute("scrolling")
        set(value) = this.setAttribute("scrolling", value)
}