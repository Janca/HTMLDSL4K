package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SelectElement : IFormElement("select", false), OptionElementProvider, OptGroupElementProvider,
        AutoFocusAttributeProvider,
        DisabledAttributeProvider,
        FormAttributeProvider,
        MultipleAttributeProvider,
        NameAttributeProvider,
        RequiredAttributeProvider,
        SizesAttributeProvider

interface SelectElementProvider : IElement {
    fun select(className: String? = null, id: String? = null, text: String? = null, init: (SelectElement.() -> Unit)? = null) = addChild(SelectElement().init(className = className, id = id, text = text, init = init))
}