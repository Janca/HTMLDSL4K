package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.*

open class FormElement : IFormElement("form", false), EmbeddedElementProvider, FormatElementProvider, HeadingElementProvider, ListElementProvider, ScriptElementProvider, StructElementProvider, TableElementProvider
interface FormElementProvider : IElement {
    fun form(className: String? = null, id: String? = null, text: String? = null, init: (FormElement.() -> Unit)? = null) = addChild(FormElement().init(className = className, id = id, text = text, init = init))
}