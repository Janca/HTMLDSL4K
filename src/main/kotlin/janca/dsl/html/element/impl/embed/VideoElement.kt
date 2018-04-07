package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class VideoElement : EmbeddedElement("video", false), SrcAttributeProvider, TrackElementProvider, SourceElementProvider
interface VideoElementProvider : IElement {
    fun video(className: String? = null, id: String? = null, text: String? = null, init: (VideoElement.() -> Unit)? = null) = addChild(VideoElement().init(className = className, id = id, text = text, init = init))
}