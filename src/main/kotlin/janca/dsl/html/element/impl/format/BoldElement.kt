package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class BoldElement : FormattingElement("b", false), PhrasingContentElementProvider
interface BoldElementProvider : IElement {
    fun b(text: String? = null, className: String? = null, id: String? = null, init: (BoldElement.() -> Unit)? = null) =
        addChild(BoldElement().init(className = className, id = id, text = text, init = init))
}