package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class SpanElement : StructuralElement("span", false), PhrasingContentElementProvider
interface SpanElementProvider : IElement {
    fun span(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (SpanElement.() -> Unit)? = null
    ) =
        addChild(SpanElement().init(className = className, id = id, text = text, init = init))
}