package janca.dsl.html.element.impl.meta

import janca.dsl.html.attribute.ColorAttributeProvider
import janca.dsl.html.attribute.FaceAttributeProvider
import janca.dsl.html.attribute.SizeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use css properties 'font-family', 'font-size', and 'color'")
open class BaseFontElement : MetadataElement("basefont", false),
    ColorAttributeProvider,
    FaceAttributeProvider,
    SizeAttributeProvider

interface BaseFontElementProvider : IElement {
    fun basefont(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (BaseFontElement.() -> Unit)? = null
    ) = addChild(BaseFontElement().init(className = className, id = id, text = text, init = init))
}