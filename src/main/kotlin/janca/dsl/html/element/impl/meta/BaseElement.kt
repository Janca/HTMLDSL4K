package janca.dsl.html.element.impl.meta

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class BaseElement : MetadataElement("base", false)
interface BaseElementProvider : IElement {
    fun base(className: String? = null, id: String? = null, text: String? = null, init: (BaseElement.() -> Unit)? = null) = addChild(BaseElement().init(className = className, id = id, text = text, init = init))
}