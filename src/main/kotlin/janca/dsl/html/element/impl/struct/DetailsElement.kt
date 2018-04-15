package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.OpenAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class DetailsElement : StructuralElement("details", false), FlowContentElementProvider, SummaryElementProvider,
        OpenAttributeProvider

interface DetailsElementProvider : IElement {
    fun details(className: String? = null, id: String? = null, text: String? = null, init: (DetailsElement.() -> Unit)? = null) = addChild(DetailsElement().init(className = className, id = id, text = text, init = init))
}