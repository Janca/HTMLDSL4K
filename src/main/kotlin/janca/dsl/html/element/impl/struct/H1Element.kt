package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class H1Element : StructuralElement("h1", false), PhrasingContentElementProvider
interface H1ElementProvider : IElement {
    fun h1(text: String? = null, className: String? = null, id: String? = null, init: H1Element.() -> Unit = {}) = addChild(H1Element().init(className = className, id = id, text = text, init = init))
}