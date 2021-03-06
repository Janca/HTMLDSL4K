package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.FormActionAttributeProvider
import janca.dsl.html.attribute.HighAttributeProvider
import janca.dsl.html.attribute.LowAttributeProvider
import janca.dsl.html.attribute.MaxAttributeProvider
import janca.dsl.html.attribute.MinAttributeProvider
import janca.dsl.html.attribute.OptimumAttributeProvider
import janca.dsl.html.attribute.ValueAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class MeterElement : IFormElement("meter", false), PhrasingContentElementProvider,
    ValueAttributeProvider,
    MinAttributeProvider,
    MaxAttributeProvider,
    LowAttributeProvider,
    HighAttributeProvider,
    OptimumAttributeProvider,
    FormActionAttributeProvider

interface MeterElementProvider : IElement {
    fun meter(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (MeterElement.() -> Unit)? = null
    ) = addChild(MeterElement().init(className = className, id = id, text = text, init = init))
}