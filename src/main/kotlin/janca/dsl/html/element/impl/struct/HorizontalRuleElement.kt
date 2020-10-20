package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.ColorAttributeProvider
import janca.dsl.html.attribute.NoShadeAttributeProvider
import janca.dsl.html.attribute.SizeAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class HorizontalRuleElement : StructuralElement("hr", false),
    AlignAttributeProvider,
    ColorAttributeProvider,
    SizeAttributeProvider,
    WidthAttributeProvider,
    NoShadeAttributeProvider

interface HorizontalRuleElementProvider : IElement {
    fun hr(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (HorizontalRuleElement.() -> Unit)? = null
    ) =
        addChild(HorizontalRuleElement().init(className = className, id = id, text = text, init = init))
}