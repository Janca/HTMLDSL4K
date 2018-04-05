package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class DivElement : StructuralElement("div", false), FlowContentElementProvider
interface DivElementProvider : IElement {
    fun div(className: String? = null, id: String? = null, text: String? = null, init: DivElement.() -> Unit = {}) = addChild(DivElement().init(className = className, id = id, text = text, init = init))
}