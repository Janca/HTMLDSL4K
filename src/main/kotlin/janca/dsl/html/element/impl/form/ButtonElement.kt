package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.*
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
    fun button(className: String? = null, id: String? = null, text: String? = null, init: (ButtonElement.() -> Unit)? = null) = addChild(ButtonElement().init(className = className, id = id, text = text, init = init))
}