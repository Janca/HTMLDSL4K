package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.DefaultAttributeProvider
import janca.dsl.html.attribute.KindAttributeProvider
import janca.dsl.html.attribute.LabelAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.SrcLangAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TrackElement : EmbeddedElement("track", false),
    DefaultAttributeProvider,
    KindAttributeProvider,
    LabelAttributeProvider,
    SrcAttributeProvider,
    SrcLangAttributeProvider

interface TrackElementProvider : IElement {
    fun track(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TrackElement.() -> Unit)? = null
    ) = addChild(TrackElement().init(className = className, id = id, text = text, init = init))
}