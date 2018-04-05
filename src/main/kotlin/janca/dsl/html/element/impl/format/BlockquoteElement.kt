package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class BlockquoteElement : FormattingElement("blockquote", false), FlowContentElementProvider
interface BlockquoteElementProvider : IElement {
    fun blockquote(className: String? = null, id: String? = null, text: String? = null, init: (BlockquoteElement.() -> Unit)? = null) = addChild(BlockquoteElement().init(className = className, id = id, text = text, init = init))
}