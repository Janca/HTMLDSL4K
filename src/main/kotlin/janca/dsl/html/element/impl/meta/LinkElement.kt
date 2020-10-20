package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.CharsetAttributeProvider
import janca.dsl.html.attribute.CrossOriginAttributeProvider
import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.HrefAttributeProvider
import janca.dsl.html.attribute.ItegrityAttributeProvider
import janca.dsl.html.attribute.MediaAttributeProvider
import janca.dsl.html.attribute.MethodsAttributeProvider
import janca.dsl.html.attribute.PrefetchAttributeProvider
import janca.dsl.html.attribute.ReferrerPolicyAttributeProvider
import janca.dsl.html.attribute.RelAttributeProvider
import janca.dsl.html.attribute.RevAttributeProvider
import janca.dsl.html.attribute.SizesAttributeProvider
import janca.dsl.html.attribute.TargetAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement

open class LinkElement : MetadataElement("link", false), HrefAttributeProvider, RelAttributeProvider,
    CrossOriginAttributeProvider,
    DisabledAttributeProvider,
    MediaAttributeProvider,
    ItegrityAttributeProvider,
    MethodsAttributeProvider,
    PrefetchAttributeProvider,
    ReferrerPolicyAttributeProvider,
    SizesAttributeProvider,
    TargetAttributeProvider,
    TypeAttributeProvider,
    CharsetAttributeProvider,
    RevAttributeProvider

interface LinkElementProvider : IElement {
    fun link(href: String? = null, rel: String? = "stylesheet", init: (LinkElement.() -> Unit)? = null) {
        addChild(LinkElement().also {
            href?.let { h ->
                it.hrefAttr = h
            }

            rel?.let { r ->
                it.rel = r
            }

            init?.invoke(it)
        })
    }
}