package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class StrikeThroughElement : FormattingElement("s", false)
interface StrikeThroughElementProvider : IElement {
    fun s(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (StrikeThroughElement.() -> Unit)? = null
    ) = addChild(StrikeThroughElement().init(className = className, id = id, text = text, init = init))
}