package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.ColsAttributeProvider
import janca.dsl.html.attribute.RowsAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'iframe'")
open class FrameSetElement :
        EmbeddedElement("frameset", false),
        FrameElementProvider,
        ColsAttributeProvider,
        RowsAttributeProvider

interface FrameSetElementProvider : IElement {
    @Deprecated("Use 'iframe'", ReplaceWith("addChild(IFrameElement().init(className = className, id = id, text = text, init = init))", "janca.dsl.html.element.impl.embed.IFrameElement", "janca.dsl.html.element.init"))
    fun frameset(className: String? = null, id: String? = null, text: String? = null, init: (FrameSetElement.() -> Unit)? = null) = addChild(FrameSetElement().init(className = className, id = id, text = text, init = init))
}