package janca.dsl.html.element.impl.format

import janca.dsl.html.attribute.ColsAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.attribute.WrapAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class PreFormattedTextElement : FormattingElement("pre", false), PhrasingContentElementProvider,
    ColsAttributeProvider,
    WidthAttributeProvider,
    WrapAttributeProvider

interface PreFormattedTextElementProvider : IElement {
    fun pre(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (PreFormattedTextElement.() -> Unit)? = null
    ) = addChild(PreFormattedTextElement().init(className = className, id = id, text = text, init = init))
}