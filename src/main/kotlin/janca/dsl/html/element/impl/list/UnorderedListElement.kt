package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.CompactAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class UnorderedListElement : ListElement("ul", false), ListItemElementProvider,
        CompactAttributeProvider,
        TypeAttributeProvider

interface UnorderedListElementProvider : IElement {
    fun ul(className: String? = null, id: String? = null, text: String? = null, init: (UnorderedListElement.() -> Unit)? = null) = addChild(UnorderedListElement().init(className = className, id = id, text = text, init = init))
}