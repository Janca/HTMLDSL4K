package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class H2Element : StructuralElement("h2", false), PhrasingContentElementProvider
interface H2ElementProvider : IElement {
    fun h2(text: String? = null, className: String? = null, id: String? = null, init: (H2Element.() -> Unit)? = null) = addChild(H2Element().init(className = className, id = id, text = text, init = init))
}