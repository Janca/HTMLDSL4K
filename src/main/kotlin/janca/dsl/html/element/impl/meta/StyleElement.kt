package janca.dsl.html.element.impl.meta

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class StyleElement : MetadataElement("style", false)
interface StyleElementProvider : IElement {
    fun style(className: String? = null, id: String? = null, text: String? = null, init: (StyleElement.() -> Unit)? = null) = addChild(StyleElement().init(className = className, id = id, text = text, init = init))
}