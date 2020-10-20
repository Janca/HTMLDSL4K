package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class FooterElement : StructuralElement("footer", false), FlowContentElementProvider
interface FooterElementProvider : IElement {
    fun footer(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (FooterElement.() -> Unit)? = null
    ) =
        addChild(FooterElement().init(className = className, id = id, text = text, init = init))
}