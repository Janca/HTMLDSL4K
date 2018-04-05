package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class CaptionElement : ITableElement("caption", false), FlowContentElementProvider
interface CaptionElementProvider : IElement {
    fun caption(className: String? = null, id: String? = null, text: String? = null, init: CaptionElement.() -> Unit = {}) = addChild(CaptionElement().init(className = className, id = id, text = text, init = init))
}