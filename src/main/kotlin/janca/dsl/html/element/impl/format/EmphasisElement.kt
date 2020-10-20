package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class EmphasisElement : FormattingElement("em", false), PhrasingContentElementProvider
interface EmphasisElementProvider : IElement {
    fun em(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (EmphasisElement.() -> Unit)? = null
    ) = addChild(EmphasisElement().init(className = className, id = id, text = text, init = init))
}