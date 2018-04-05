package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'iframe'")
open class FrameElement : EmbeddedElement("frame", false)

interface FrameElementProvider : IElement {
    @Deprecated("Use 'iframe'", ReplaceWith("addChild(IFrameElement().init(className = className, id = id, text = text, init = init))", "janca.dsl.html.element.impl.embed.IFrameElement", "janca.dsl.html.element.init"))
    fun frame(className: String? = null, id: String? = null, text: String? = null, init: (FrameElement.() -> Unit)? = null) = addChild(FrameElement().init(className = className, id = id, text = text, init = init))
}