package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Obsolete")
open class KeygenElement : IFormElement("keygen", false),
        AutoFocusAttributeProvider,
        DisabledAttributeProvider,
        FormActionAttributeProvider,
        NameAttributeProvider,
        KeyTypeAttributeProvider,
        ChallangeAttributeProvider

interface KeygenElementProvider : IElement {
    fun keygen(className: String? = null, id: String? = null, text: String? = null, init: (KeygenElement.() -> Unit)? = null) = addChild(KeygenElement().init(className = className, id = id, text = text, init = init))
}