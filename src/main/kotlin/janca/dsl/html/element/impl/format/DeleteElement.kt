package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.struct.ParagraphElementProvider
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class DeleteElement : FormattingElement("del", false), PhrasingContentElementProvider, ParagraphElementProvider
interface DeleteElementProvider : IElement {
    fun del(className: String? = null, id: String? = null, text: String? = null, init: (DeleteElement.() -> Unit)? = null) = addChild(DeleteElement().init(className = className, id = id, text = text, init = init))
}