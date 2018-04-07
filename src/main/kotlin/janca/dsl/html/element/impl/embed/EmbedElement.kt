package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class EmbedElement :
        EmbeddedElement("embed", false),
        SrcAttributeProvider,
        HeightAttributeProvider,
        WidthAttributeProvider,
        TypeAttributeProvider

interface EmbedElementProvider : IElement {
    fun embed(className: String? = null, id: String? = null, text: String? = null, init: (EmbedElement.() -> Unit)? = null) = addChild(EmbedElement().init(className = className, id = id, text = text, init = init))
}