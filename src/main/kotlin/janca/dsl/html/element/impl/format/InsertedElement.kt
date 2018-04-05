package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.struct.ParagraphElementProvider
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class InsertedElement : FormattingElement("ins", false), PhrasingContentElementProvider, ParagraphElementProvider
interface InsertedElementProvider : IElement {
    fun ins(className: String? = null, id: String? = null, text: String? = null, init: (InsertedElement.() -> Unit)? = null) = addChild(InsertedElement().init(className = className, id = id, text = text, init = init))
}