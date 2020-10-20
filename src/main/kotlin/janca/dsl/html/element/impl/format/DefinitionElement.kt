package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class DefinitionElement : FormattingElement("dfn", false), PhrasingContentElementProvider
interface DefinitionElementProvider : IElement {
    fun dfn(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (DefinitionElement.() -> Unit)? = null
    ) = addChild(DefinitionElement().init(className = className, id = id, text = text, init = init))
}