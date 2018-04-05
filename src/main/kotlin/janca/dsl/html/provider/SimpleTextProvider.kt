package janca.dsl.html.provider

import janca.dsl.html.element.IElement
import janca.dsl.html.element.TextElement

interface SimpleTextProvider : IElement {
    fun text(text: String) = addChild(TextElement(text))
}