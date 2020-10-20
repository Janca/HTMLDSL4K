package janca.dsl.html.element.impl.format

import janca.dsl.html.attribute.CiteAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class QuoteElement : FormattingElement("q", false), PhrasingContentElementProvider,
    CiteAttributeProvider

interface QuoteElementProvider : IElement {
    fun q(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (QuoteElement.() -> Unit)? = null
    ) = addChild(QuoteElement().init(className = className, id = id, text = text, init = init))
}