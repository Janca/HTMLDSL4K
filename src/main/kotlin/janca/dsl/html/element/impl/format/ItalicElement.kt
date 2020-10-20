package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class ItalicElement : FormattingElement("i", false), PhrasingContentElementProvider
interface ItalicElementProvider : IElement {
    fun i(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ItalicElement.() -> Unit)? = null
    ) = addChild(ItalicElement().init(className = className, id = id, text = text, init = init))
}