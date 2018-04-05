package janca.dsl.html.element.impl.list

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class ListItemElement : ListElement("li", false), FlowContentElementProvider
interface ListItemElementProvider : IElement {
    fun li(className: String? = null, id: String? = null, text: String? = null, init: (ListItemElement.() -> Unit)? = null) = addChild(ListItemElement().init(className = className, id = id, text = text, init = init))
}