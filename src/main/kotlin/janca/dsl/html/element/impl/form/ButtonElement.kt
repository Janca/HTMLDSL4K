package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.AutoCompleteAttributeProvider
import janca.dsl.html.attribute.AutoFocusAttributeProvider
import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.FormActionAttributeProvider
import janca.dsl.html.attribute.FormAttributeProvider
import janca.dsl.html.attribute.FormEncTypeAttributeProvider
import janca.dsl.html.attribute.FormMethodAttributeProvider
import janca.dsl.html.attribute.FormNoValidateAttributeProvider
import janca.dsl.html.attribute.FormTargetAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.ValueTypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class ButtonElement : IFormElement("button", false), PhrasingContentElementProvider,
    AutoFocusAttributeProvider,
    AutoCompleteAttributeProvider,
    DisabledAttributeProvider,
    FormAttributeProvider,
    FormActionAttributeProvider,
    FormEncTypeAttributeProvider,
    FormMethodAttributeProvider,
    FormNoValidateAttributeProvider,
    FormTargetAttributeProvider,
    NameAttributeProvider,
    TypeAttributeProvider,
    ValueTypeAttributeProvider

interface ButtonElementProvider : IElement {
    fun button(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ButtonElement.() -> Unit)? = null
    ) = addChild(ButtonElement().init(className = className, id = id, text = text, init = init))
}