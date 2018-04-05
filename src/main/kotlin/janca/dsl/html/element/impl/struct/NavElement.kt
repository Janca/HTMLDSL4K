package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class NavElement : StructuralElement("nav", false), FlowContentElementProvider
interface NavElementProvider : IElement {
    fun nav(className: String? = null, id: String? = null, text: String? = null, init: (NavElement.() -> Unit)? = null) = addChild(NavElement().init(className = className, id = id, text = text, init = init))
}