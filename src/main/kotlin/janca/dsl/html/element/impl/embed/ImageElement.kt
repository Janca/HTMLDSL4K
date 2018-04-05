package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.SizeAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ImageElement : EmbeddedElement("img", true), SrcAttributeProvider, SizeAttributeProvider
interface ImageElementProvider : IElement {
    fun img(className: String? = null, id: String? = null, text: String? = null, init: (ImageElement.() -> Unit)? = null) = addChild(ImageElement().init(className = className, id = id, text = text, init = init))
}