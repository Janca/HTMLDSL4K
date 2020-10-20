package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.ValueAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class ListItemElement : ListElement("li", false), FlowContentElementProvider,
    ValueAttributeProvider,
    TypeAttributeProvider

interface ListItemElementProvider : IElement {
    fun li(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ListItemElement.() -> Unit)? = null
    ) = addChild(ListItemElement().init(className = className, id = id, text = text, init = init))
}