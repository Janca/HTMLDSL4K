package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class MarkElement : FormattingElement("mark", false), PhrasingContentElementProvider
interface MarkElementProvider : IElement {
    fun mark(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (MarkElement.() -> Unit)? = null
    ) = addChild(MarkElement().init(className = className, id = id, text = text, init = init))
}