package janca.dsl.html.element.impl.format

import janca.dsl.html.attribute.ColorAttributeProvider
import janca.dsl.html.attribute.FaceAttributeProvider
import janca.dsl.html.attribute.SizeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use css properties or the style attribute")
open class FontElement : FormattingElement("font", false),
    ColorAttributeProvider,
    FaceAttributeProvider,
    SizeAttributeProvider

interface FontElementProvider : IElement {
    fun font(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (FontElement.() -> Unit)? = null
    ) = addChild(FontElement().init(className = className, id = id, text = text, init = init))
}