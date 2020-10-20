package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class H1Element : HeadingElement("h1")
interface H1ElementProvider : IElement {
    fun h1(text: String? = null, className: String? = null, id: String? = null, init: H1Element.() -> Unit = {}) =
        addChild(H1Element().init(className = className, id = id, text = text, init = init))
}