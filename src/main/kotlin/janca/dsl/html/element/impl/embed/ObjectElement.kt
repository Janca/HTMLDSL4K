package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ObjectElement : EmbeddedElement("object", false), ParameterElementProvider
interface ObjectElementProvider : IElement {
    fun objectElement(className: String? = null, id: String? = null, text: String? = null, init: (ObjectElement.() -> Unit)? = null) = addChild(ObjectElement().init(className = className, id = id, text = text, init = init))
}