package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.FormAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class FieldSetElement : IFormElement("fieldset", false), FlowContentElementProvider, LegendElementProvider,
        DisabledAttributeProvider,
        FormAttributeProvider,
        NameAttributeProvider

interface FieldSetElementProvider : IElement {
    fun fieldset(className: String? = null, id: String? = null, text: String? = null, init: (FieldSetElement.() -> Unit)? = null) = addChild(FieldSetElement().init(className = className, id = id, text = text, init = init))
}