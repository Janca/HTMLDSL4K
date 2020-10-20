package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AutoPlayAttributeProvider
import janca.dsl.html.attribute.BufferedAttributeProvider
import janca.dsl.html.attribute.ControlsAttributeProvider
import janca.dsl.html.attribute.LoopAttributeProvider
import janca.dsl.html.attribute.MozCurrentSampleOffsetAttributeProvider
import janca.dsl.html.attribute.MutedAttributeProvider
import janca.dsl.html.attribute.PlayedAttributeProvider
import janca.dsl.html.attribute.PreloadAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.VolumeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class AudioElement
    : EmbeddedElement("audio", false),
    SourceElementProvider,
    TrackElementProvider,
    AutoPlayAttributeProvider,
    BufferedAttributeProvider,
    ControlsAttributeProvider,
    LoopAttributeProvider,
    MozCurrentSampleOffsetAttributeProvider,
    MutedAttributeProvider,
    PlayedAttributeProvider,
    PreloadAttributeProvider,
    SrcAttributeProvider,
    VolumeAttributeProvider


interface AudioElementProvider : IElement {
    fun audio(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (AudioElement.() -> Unit)? = null
    ) = addChild(AudioElement().init(className = className, id = id, text = text, init = init))
}