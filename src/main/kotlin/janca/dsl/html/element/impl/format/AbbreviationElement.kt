package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class AbbreviationElement : FormattingElement("abbr", false), PhrasingContentElementProvider
interface AbbreviationElementProvider : IElement {
    fun abbr(className: String? = null, id: String? = null, text: String? = null, init: (AbbreviationElement.() -> Unit)? = null) = addChild(AbbreviationElement().init(className = className, id = id, text = text, init = init))
}