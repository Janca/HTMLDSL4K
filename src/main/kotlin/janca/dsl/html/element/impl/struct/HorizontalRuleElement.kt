package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class HorizontalRuleElement : StructuralElement("hr", false)
interface HorizontalRuleElementProvider : IElement {
    fun hr(className: String? = null, id: String? = null, text: String? = null, init: (HorizontalRuleElement.() -> Unit)? = null) = addChild(HorizontalRuleElement().init(className = className, id = id, text = text, init = init))
}