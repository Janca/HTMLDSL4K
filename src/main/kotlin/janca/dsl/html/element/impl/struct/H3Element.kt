package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class H3Element : StructuralElement("h3", false), PhrasingContentElementProvider
interface H3ElementProvider : IElement {
    fun h3(text: String? = null, className: String? = null, id: String? = null, init: (H3Element.() -> Unit)? = null) = addChild(H3Element().init(className = className, id = id, text = text, init = init))
}