package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.FrameBorderAttributeProvider
import janca.dsl.html.attribute.MarginHeightAttributeProvider
import janca.dsl.html.attribute.MarginWidthAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.NoResizeAttributeProvider
import janca.dsl.html.attribute.ScrollingAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'iframe'")
open class FrameElement :
    EmbeddedElement("frame", false),
    SrcAttributeProvider,
    NameAttributeProvider,
    NoResizeAttributeProvider,
    ScrollingAttributeProvider,
    MarginHeightAttributeProvider,
    MarginWidthAttributeProvider,
    FrameBorderAttributeProvider

interface FrameElementProvider : IElement {
    @Deprecated(
        "Use 'iframe'",
        ReplaceWith(
            "addChild(IFrameElement().init(className = className, id = id, text = text, init = init))",
            "janca.dsl.html.element.impl.embed.IFrameElement",
            "janca.dsl.html.element.init"
        )
    )
    fun frame(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (FrameElement.() -> Unit)? = null
    ) = addChild(FrameElement().init(className = className, id = id, text = text, init = init))
}