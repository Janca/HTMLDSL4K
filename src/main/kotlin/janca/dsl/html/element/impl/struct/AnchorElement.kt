package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.CharsetAttributeProvider
import janca.dsl.html.attribute.CoordsAttributeProvider
import janca.dsl.html.attribute.DownloadAttributeProvider
import janca.dsl.html.attribute.HrefAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.ReferrerPolicyAttributeProvider
import janca.dsl.html.attribute.RelAttributeProvider
import janca.dsl.html.attribute.RevAttributeProvider
import janca.dsl.html.attribute.ShapeAttributeProvider
import janca.dsl.html.attribute.TargetAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider


open class AnchorElement : StructuralElement("a", false), HrefAttributeProvider, FlowContentElementProvider,
    DownloadAttributeProvider,
    ReferrerPolicyAttributeProvider,
    RelAttributeProvider,
    TargetAttributeProvider,
    TypeAttributeProvider,
    CharsetAttributeProvider,
    CoordsAttributeProvider,
    NameAttributeProvider,
    RevAttributeProvider,
    ShapeAttributeProvider

interface AnchorElementProvider : IElement {
    fun a(
        text: String? = null,
        href: String? = null,
        className: String? = null,
        id: String? = null,
        init: (AnchorElement.() -> Unit)? = null
    ) =
        addChild(AnchorElement().also { a -> href?.let { a.hrefAttr = it } }
            .init(className = className, id = id, text = text, init = init))
}