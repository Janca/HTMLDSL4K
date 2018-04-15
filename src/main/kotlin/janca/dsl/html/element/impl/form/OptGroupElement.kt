package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.LabelAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class OptGroupElement : IFormElement("optgroup", false), OptionElementProvider,
        DisabledAttributeProvider,
        LabelAttributeProvider

interface OptGroupElementProvider : IElement {
    fun optgroup(className: String? = null, id: String? = null, text: String? = null, init: (OptGroupElement.() -> Unit)? = null) = addChild(OptGroupElement().init(className = className, id = id, text = text, init = init))
}