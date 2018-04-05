package janca.dsl.html.element.impl.meta

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class MetaElement : MetadataElement("meta", false)
interface MetaElementProvider : IElement {
    fun meta(className: String? = null, id: String? = null, text: String? = null, init: (MetaElement.() -> Unit)? = null) = addChild(MetaElement().init(className = className, id = id, text = text, init = init))
}