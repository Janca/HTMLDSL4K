package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ParameterElement : EmbeddedElement("param", true)
interface ParameterElementProvider : IElement {
    fun param(className: String? = null, id: String? = null, text: String? = null, init: (ParameterElement.() -> Unit)? = null) = addChild(ParameterElement().init(className = className, id = id, text = text, init = init))
}