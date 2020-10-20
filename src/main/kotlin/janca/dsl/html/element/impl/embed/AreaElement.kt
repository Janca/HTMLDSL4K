package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AccessKeyAttributeProvider
import janca.dsl.html.attribute.AltAttributeProvider
import janca.dsl.html.attribute.CoordsAttributeProvider
import janca.dsl.html.attribute.DownloadAttributeProvider
import janca.dsl.html.attribute.MediaAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.ReferrerPolicyAttributeProvider
import janca.dsl.html.attribute.RelAttributeProvider
import janca.dsl.html.attribute.ShapeAttributeProvider
import janca.dsl.html.attribute.TabIndexAttributeProvider
import janca.dsl.html.attribute.TargetAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class AreaElement :
    EmbeddedElement("area", true),
    AccessKeyAttributeProvider,
    AltAttributeProvider,
    CoordsAttributeProvider,
    DownloadAttributeProvider,
    NameAttributeProvider,
    MediaAttributeProvider,
    ReferrerPolicyAttributeProvider,
    RelAttributeProvider,
    ShapeAttributeProvider,
    TabIndexAttributeProvider,
    TargetAttributeProvider,
    TypeAttributeProvider

interface AreaElementProvider : IElement {
    fun area(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (AreaElement.() -> Unit)? = null
    ) = addChild(AreaElement().init(className = className, id = id, text = text, init = init))
}