package janca.dsl.html.element.impl.list

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class DefinitionListElement : ListElement("dl", false), DefinitionDescriptionElementProvider, DefinitionTermElementProvider
interface DefinitionListElementProvider : IElement {
    fun dl(className: String? = null, id: String? = null, text: String? = null, init: (DefinitionListElement.() -> Unit)? = null) = addChild(DefinitionListElement().init(className = className, id = id, text = text, init = init))
}