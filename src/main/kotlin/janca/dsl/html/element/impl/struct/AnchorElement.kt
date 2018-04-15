package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.*
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
    fun a(text: String? = null, href: String? = null, className: String? = null, id: String? = null, init: (AnchorElement.() -> Unit)? = null) = addChild(AnchorElement().also { a -> href?.let { a.hrefAttr = it } }.init(className = className, id = id, text = text, init = init))
}