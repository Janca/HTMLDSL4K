package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class IFrameElement :
        EmbeddedElement("iframe", false),
        AllowFullscreenAttributeProvider,
        AllowPaymentRequestAttributeProvider,
        HeightAttributeProvider,
        NameAttributeProvider,
        ReferrerPolicyAttributeProvider,
        SandboxAttributeProvider,
        SrcAttributeProvider,
        SrcDocAttributeProvider,
        WidthAttributeProvider,
        AlignAttributeProvider,
        FrameBorderAttributeProvider,
        LongDescAttributeProvider,
        MarginHeightAttributeProvider,
        MarginWidthAttributeProvider,
        ScrollingAttributeProvider

interface IFrameElementProvider : IElement {
    fun iframe(className: String? = null, id: String? = null, text: String? = null, init: (IFrameElement.() -> Unit)? = null) = addChild(IFrameElement().init(className = className, id = id, text = text, init = init))
}