package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.CharsetAttributeProvider
import janca.dsl.html.attribute.ContentAttributeProvider
import janca.dsl.html.attribute.HttpEquivAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class MetaElement : MetadataElement("meta", false),
        CharsetAttributeProvider,
        NameAttributeProvider,
        HttpEquivAttributeProvider,
        ContentAttributeProvider

interface MetaElementProvider : IElement {
    fun meta(className: String? = null, id: String? = null, text: String? = null, init: (MetaElement.() -> Unit)? = null) = addChild(MetaElement().init(className = className, id = id, text = text, init = init))
}