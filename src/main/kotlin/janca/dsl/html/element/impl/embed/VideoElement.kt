package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class VideoElement : EmbeddedElement("video", false), SrcAttributeProvider, TrackElementProvider, SourceElementProvider,
        AutoPlayAttributeProvider,
        BufferedAttributeProvider,
        ControlsAttributeProvider,
        CrossOriginAttributeProvider,
        HeightAttributeProvider,
        LoopAttributeProvider,
        MutedAttributeProvider,
        PlayedAttributeProvider,
        PreloadAttributeProvider,
        PosterAttributeProvider,
        WidthAttributeProvider,
        PlaysInlineAttributeProvider

interface VideoElementProvider : IElement {
    fun video(className: String? = null, id: String? = null, text: String? = null, init: (VideoElement.() -> Unit)? = null) = addChild(VideoElement().init(className = className, id = id, text = text, init = init))
}