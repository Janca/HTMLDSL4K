package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.*
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
    fun img(className: String? = null, id: String? = null, text: String? = null, init: (ImageElement.() -> Unit)? = null) = addChild(ImageElement().init(className = className, id = id, text = text, init = init))
}