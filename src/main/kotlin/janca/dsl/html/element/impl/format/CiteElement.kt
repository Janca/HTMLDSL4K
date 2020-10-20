package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class CiteElement : FormattingElement("cite", false), PhrasingContentElementProvider
interface CiteElementProvider : IElement {
    fun cite(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (CiteElement.() -> Unit)? = null
    ) = addChild(CiteElement().init(className = className, id = id, text = text, init = init))
}