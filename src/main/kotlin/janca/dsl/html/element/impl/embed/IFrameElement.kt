package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.AllowFullscreenAttributeProvider
import janca.dsl.html.attribute.AllowPaymentRequestAttributeProvider
import janca.dsl.html.attribute.FrameBorderAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.LongDescAttributeProvider
import janca.dsl.html.attribute.MarginHeightAttributeProvider
import janca.dsl.html.attribute.MarginWidthAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.ReferrerPolicyAttributeProvider
import janca.dsl.html.attribute.SandboxAttributeProvider
import janca.dsl.html.attribute.ScrollingAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.SrcDocAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
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
    fun iframe(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (IFrameElement.() -> Unit)? = null
    ) = addChild(IFrameElement().init(className = className, id = id, text = text, init = init))
}