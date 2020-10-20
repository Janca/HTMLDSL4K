package janca.dsl.html.element.impl.format

import janca.dsl.html.attribute.CiteAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class BlockQuoteElement : FormattingElement("blockquote", false), FlowContentElementProvider,
    CiteAttributeProvider

interface BlockQuoteElementProvider : IElement {
    fun blockquote(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (BlockQuoteElement.() -> Unit)? = null
    ) = addChild(BlockQuoteElement().init(className = className, id = id, text = text, init = init))
}