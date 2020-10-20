package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.LabelAttributeProvider
import janca.dsl.html.attribute.SelectedAttributeProvider
import janca.dsl.html.attribute.ValueAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class OptionElement : IFormElement("option", false),
    DisabledAttributeProvider,
    LabelAttributeProvider,
    ValueAttributeProvider,
    SelectedAttributeProvider

interface OptionElementProvider : IElement {
    fun option(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (OptionElement.() -> Unit)? = null
    ) = addChild(OptionElement().init(className = className, id = id, text = text, init = init))
}