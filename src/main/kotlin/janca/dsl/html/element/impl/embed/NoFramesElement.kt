package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Obsolete")
open class NoFramesElement : EmbeddedElement("noframes", false)

interface NoFramesElementProvider : IElement {
    fun noframes(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (NoFramesElement.() -> Unit)? = null
    ) = addChild(NoFramesElement().init(className = className, id = id, text = text, init = init))
}