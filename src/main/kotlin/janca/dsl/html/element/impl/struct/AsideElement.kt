package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class AsideElement : StructuralElement("aside", false), FlowContentElementProvider
interface AsideElementProvider : IElement {
    fun aside(className: String? = null, id: String? = null, text: String? = null, init: (AsideElement.() -> Unit)? = null) = addChild(AsideElement().init(className = className, id = id, text = text, init = init))
}