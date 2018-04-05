package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class SmallElement : FormattingElement("small", false), PhrasingContentElementProvider
interface SmallElementProvider : IElement {
    fun small(className: String? = null, id: String? = null, text: String? = null, init: (SmallElement.() -> Unit)? = null) = addChild(SmallElement().init(className = className, id = id, text = text, init = init))
}