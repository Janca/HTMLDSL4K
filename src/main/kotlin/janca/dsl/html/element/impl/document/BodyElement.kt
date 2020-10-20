package janca.dsl.html.element.impl.document

import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.struct.StructuralElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class BodyElement : StructuralElement("body", false), FlowContentElementProvider
interface BodyElementProvider : IElement {
    fun body(className: String? = null, id: String? = null, text: String? = null, init: BodyElement.() -> Unit = {}) =
        addChild(BodyElement().init(className = className, id = id, text = text, init = init))
}