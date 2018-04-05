package janca.dsl.html.element.impl.document

import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.struct.StructuralElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.MetaElementProvider
import janca.dsl.html.provider.ScriptElementProvider

open class HeadElement : StructuralElement("head", false), MetaElementProvider, ScriptElementProvider
interface HeadElementProvider : IElement {
    fun head(className: String? = null, id: String? = null, text: String? = null, init: HeadElement.() -> Unit) = addChild(HeadElement().init(className = className, id = id, text = text, init = init))
}