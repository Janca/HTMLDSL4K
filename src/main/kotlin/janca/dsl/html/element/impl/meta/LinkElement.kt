package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.HrefAttributeProvider
import janca.dsl.html.attribute.RelAttributeProvider
import janca.dsl.html.element.IElement

open class LinkElement : MetadataElement("link", false), HrefAttributeProvider, RelAttributeProvider
interface LinkElementProvider : IElement {
    fun link(href: String? = null, rel: String? = "stylesheet", init: (LinkElement.() -> Unit)? = null) {
        addChild(LinkElement().also {
            href?.let { h ->
                it.href = h
            }

            rel?.let { r ->
                it.rel = r
            }

            init?.invoke(it)
        })
    }
}