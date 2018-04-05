package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement

open class BreakElement : StructuralElement("br", true)
interface BreakElementProvider : IElement {
    fun br() = addChild(BreakElement())
}