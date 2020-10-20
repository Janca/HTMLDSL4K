package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.MediaAttributeProvider
import janca.dsl.html.attribute.SizesAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.SrcSetAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SourceElement : EmbeddedElement("source", false),
    SizesAttributeProvider,
    SrcAttributeProvider,
    SrcSetAttributeProvider,
    TypeAttributeProvider,
    MediaAttributeProvider

interface SourceElementProvider : IElement {
    fun source(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (SourceElement.() -> Unit)? = null
    ) = addChild(SourceElement().init(className = className, id = id, text = text, init = init))
}