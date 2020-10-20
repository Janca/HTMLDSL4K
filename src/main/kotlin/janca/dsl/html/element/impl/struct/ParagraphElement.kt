package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class ParagraphElement : StructuralElement("p", false), PhrasingContentElementProvider,
    AlignAttributeProvider {
}

interface ParagraphElementProvider : IElement {
    fun p(text: String? = null, className: String? = null, id: String? = null, init: ParagraphElement.() -> Unit = {}) =
        addChild(ParagraphElement().init(className = className, id = id, text = text, init = init))
}