package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.AltAttributeProvider
import janca.dsl.html.attribute.BorderAttributeProvider
import janca.dsl.html.attribute.CrossOriginAttributeProvider
import janca.dsl.html.attribute.DecodingAttributeProvider
import janca.dsl.html.attribute.HSpaceAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.IsMapAttributeProvider
import janca.dsl.html.attribute.LongDescAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.ReferrerPolicyAttributeProvider
import janca.dsl.html.attribute.SizesAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.SrcSetAttributeProvider
import janca.dsl.html.attribute.UseMapAttributeProvider
import janca.dsl.html.attribute.VSpaceAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ImageElement :
    EmbeddedElement("img", true),
    AlignAttributeProvider,
    AltAttributeProvider,
    BorderAttributeProvider,
    CrossOriginAttributeProvider,
    DecodingAttributeProvider,
    HeightAttributeProvider,
    HSpaceAttributeProvider,
    IsMapAttributeProvider,
    LongDescAttributeProvider,
    NameAttributeProvider,
    ReferrerPolicyAttributeProvider,
    SizesAttributeProvider,
    SrcAttributeProvider,
    SrcSetAttributeProvider,
    WidthAttributeProvider,
    UseMapAttributeProvider,
    VSpaceAttributeProvider

interface ImageElementProvider : IElement {
    fun img(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ImageElement.() -> Unit)? = null
    ) = addChild(ImageElement().init(className = className, id = id, text = text, init = init))
}