package janca.dsl.html.element.impl.meta

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TitleElement : MetadataElement("title", false)
interface TitleElementProvider : IElement {
    fun title(text: String? = null) = addChild(TitleElement().init(text = text))
}