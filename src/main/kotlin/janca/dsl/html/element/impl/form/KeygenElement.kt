package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.AutoFocusAttributeProvider
import janca.dsl.html.attribute.ChallangeAttributeProvider
import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.FormActionAttributeProvider
import janca.dsl.html.attribute.KeyTypeAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
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
    fun keygen(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (KeygenElement.() -> Unit)? = null
    ) = addChild(KeygenElement().init(className = className, id = id, text = text, init = init))
}