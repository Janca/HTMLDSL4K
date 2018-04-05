package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class H4Element : StructuralElement("h4", false), PhrasingContentElementProvider
interface H4ElementProvider : IElement {
    fun h4(text: String? = null, className: String? = null, id: String? = null, init: (H4Element.() -> Unit)? = null) = addChild(H4Element().init(className = className, id = id, text = text, init = init))
}