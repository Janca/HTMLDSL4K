package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.CompactAttributeProvider
import janca.dsl.html.attribute.ReversedAttributeProvider
import janca.dsl.html.attribute.StartAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class OrderedListElement : ListElement("ol", false), ListItemElementProvider,
    CompactAttributeProvider,
    ReversedAttributeProvider,
    StartAttributeProvider

interface OrderedListElementProvider : IElement {
    fun ol(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (OrderedListElement.() -> Unit)? = null
    ) = addChild(OrderedListElement().init(className = className, id = id, text = text, init = init))
}