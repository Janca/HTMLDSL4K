package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

@Deprecated("Use css property 'text-decoration'")
open class UnderlineElement : FormattingElement("u", false), PhrasingContentElementProvider

interface UnderlineElementProvider : IElement {
    fun u(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (UnderlineElement.() -> Unit)? = null
    ) = addChild(UnderlineElement().init(className = className, id = id, text = text, init = init))
}