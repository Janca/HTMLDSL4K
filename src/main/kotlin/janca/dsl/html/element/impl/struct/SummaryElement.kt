package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.HeadingElementProvider
import janca.dsl.html.provider.PhrasingContentElementProvider

open class SummaryElement : StructuralElement("summary", false), PhrasingContentElementProvider, HeadingElementProvider
interface SummaryElementProvider : IElement {
    fun summary(className: String? = null, id: String? = null, text: String? = null, init: (SummaryElement.() -> Unit)? = null) = addChild(SummaryElement().init(className = className, id = id, text = text, init = init))
}

