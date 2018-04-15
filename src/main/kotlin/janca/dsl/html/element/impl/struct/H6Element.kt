package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class H6Element : HeadingElement("h6")
interface H6ElementProvider : IElement {
    fun h6(text: String? = null, className: String? = null, id: String? = null, init: (H6Element.() -> Unit)? = null) = addChild(H6Element().init(className = className, id = id, text = text, init = init))
}