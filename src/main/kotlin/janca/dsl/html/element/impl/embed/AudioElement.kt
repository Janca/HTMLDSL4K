package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class AudioElement : EmbeddedElement("audio", false), SourceElementProvider, TrackElementProvider
interface AudioElementProvider : IElement {
    fun audio(className: String? = null, id: String? = null, text: String? = null, init: (AudioElement.() -> Unit)? = null) = addChild(AudioElement().init(className = className, id = id, text = text, init = init))
}