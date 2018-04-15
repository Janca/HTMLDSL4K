package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.ClearAttributeProvider
import janca.dsl.html.element.IElement

open class BreakElement : StructuralElement("br", true), ClearAttributeProvider
interface BreakElementProvider : IElement {
    fun br() = addChild(BreakElement())
}