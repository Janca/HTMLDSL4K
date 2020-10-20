package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class SectionElement : StructuralElement("section", false), FlowContentElementProvider
interface SectionElementProvider : IElement {
    fun section(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (SectionElement.() -> Unit)? = null
    ) =
        addChild(SectionElement().init(className = className, id = id, text = text, init = init))
}