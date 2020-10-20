package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.ValueAttributeProvider
import janca.dsl.html.attribute.ValueTypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ParameterElement : EmbeddedElement("param", true),
    NameAttributeProvider,
    TypeAttributeProvider,
    ValueAttributeProvider,
    ValueTypeAttributeProvider

interface ParameterElementProvider : IElement {
    fun param(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ParameterElement.() -> Unit)? = null
    ) = addChild(ParameterElement().init(className = className, id = id, text = text, init = init))
}