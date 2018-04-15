package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.NoWrapAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class DefinitionDescriptionElement : ListElement("dd", false), FlowContentElementProvider,
        NoWrapAttributeProvider

interface DefinitionDescriptionElementProvider : IElement {
    fun dd(className: String? = null, id: String? = null, text: String? = null, init: (DefinitionDescriptionElement.() -> Unit)? = null) = addChild(DefinitionDescriptionElement().init(className = className, id = id, text = text, init = init))
}