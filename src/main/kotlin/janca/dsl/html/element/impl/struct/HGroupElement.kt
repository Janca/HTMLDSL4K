package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.HeadingElementProvider

open class HGroupElement : StructuralElement("hgroup", false), HeadingElementProvider
interface HGroupElementProvider : IElement {
    fun hgroup(className: String? = null, id: String? = null, text: String? = null, init: (HGroupElement.() -> Unit)? = null) = addChild(HGroupElement().init(className = className, id = id, text = text, init = init))
}