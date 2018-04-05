package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class InputElement : IFormElement("input", true)
interface InputElementProvider : IElement {
    fun input(className: String? = null, id: String? = null, text: String? = null, init: (InputElement.() -> Unit)? = null) = addChild(InputElement().init(className = className, id = id, text = text, init = init))
}