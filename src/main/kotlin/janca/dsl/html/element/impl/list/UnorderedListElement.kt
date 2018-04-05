package janca.dsl.html.element.impl.list

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class UnorderedListElement : ListElement("ul", false), ListItemElementProvider
interface UnorderedListElementProvider : IElement {
    fun ul(className: String? = null, id: String? = null, text: String? = null, init: (UnorderedListElement.() -> Unit)? = null) = addChild(UnorderedListElement().init(className = className, id = id, text = text, init = init))
}