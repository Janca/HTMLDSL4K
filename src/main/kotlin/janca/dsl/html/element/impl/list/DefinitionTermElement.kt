package janca.dsl.html.element.impl.list

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class DefinitionTermElement : ListElement("dt", false), FlowContentElementProvider
interface DefinitionTermElementProvider : IElement {
    fun dt(className: String? = null, id: String? = null, text: String? = null, init: (DefinitionTermElement.() -> Unit)? = null) = addChild(DefinitionTermElement().init(className = className, id = id, text = text, init = init))
}