package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class LabelElement : IFormElement("label", false), PhrasingContentElementProvider
interface LabelElementProvider : IElement {
    fun label(className: String? = null, id: String? = null, text: String? = null, init: (LabelElement.() -> Unit)? = null) = addChild(LabelElement().init(className = className, id = id, text = text, init = init))
}