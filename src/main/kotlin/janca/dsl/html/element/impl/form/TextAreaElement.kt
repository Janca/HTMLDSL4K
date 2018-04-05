package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TextAreaElement : IFormElement("textarea", false)
interface TextAreaElementProvider : IElement {
    fun textarea(className: String? = null, id: String? = null, text: String? = null, init: (TextAreaElement.() -> Unit)? = null) = addChild(TextAreaElement().init(className = className, id = id, text = text, init = init))
}