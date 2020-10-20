package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class HeaderElement : StructuralElement("header", false), FlowContentElementProvider
interface HeaderElementProvider : IElement {
    fun header(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (HeaderElement.() -> Unit)? = null
    ) =
        addChild(HeaderElement().init(className = className, id = id, text = text, init = init))
}