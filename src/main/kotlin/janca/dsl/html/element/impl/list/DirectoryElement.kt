package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.CompactAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'ul'")
open class DirectoryElement : ListElement("dir", false),
    CompactAttributeProvider

interface DirectoryElementProvider : IElement {
    @Deprecated(
        "Use 'ul'",
        ReplaceWith(
            "addChild(UnorderedListElement().init(className = className, id = id, text = text, init = init))",
            "janca.dsl.html.element.impl.list.UnorderedListElement",
            "janca.dsl.html.element.init"
        )
    )
    fun dir(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (DirectoryElement.() -> Unit)? = null
    ) = addChild(DirectoryElement().init(className = className, id = id, text = text, init = init))
}