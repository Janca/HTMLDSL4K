package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class H5Element : StructuralElement("h5", false), PhrasingContentElementProvider
interface H5ElementProvider : IElement {
    fun h5(text: String? = null, className: String? = null, id: String? = null, init: (H5Element.() -> Unit)? = null) = addChild(H5Element().init(className = className, id = id, text = text, init = init))
}