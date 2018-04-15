package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.*
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