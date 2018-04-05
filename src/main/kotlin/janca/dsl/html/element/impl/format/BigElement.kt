package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use css property 'font-size'")
open class BigElement : FormattingElement("big", false)

interface BigElementProvider : IElement {
    fun big(className: String? = null, id: String? = null, text: String? = null, init: (BigElement.() -> Unit)? = null) = addChild(BigElement().init(className = className, id = id, text = text, init = init))
}