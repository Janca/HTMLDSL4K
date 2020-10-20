package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AutoPlayAttributeProvider
import janca.dsl.html.attribute.BufferedAttributeProvider
import janca.dsl.html.attribute.ControlsAttributeProvider
import janca.dsl.html.attribute.CrossOriginAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.LoopAttributeProvider
import janca.dsl.html.attribute.MutedAttributeProvider
import janca.dsl.html.attribute.PlayedAttributeProvider
import janca.dsl.html.attribute.PlaysInlineAttributeProvider
import janca.dsl.html.attribute.PosterAttributeProvider
import janca.dsl.html.attribute.PreloadAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class VideoElement : EmbeddedElement("video", false), SrcAttributeProvider, TrackElementProvider,
    SourceElementProvider,
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
    fun video(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (VideoElement.() -> Unit)? = null
    ) = addChild(VideoElement().init(className = className, id = id, text = text, init = init))
}