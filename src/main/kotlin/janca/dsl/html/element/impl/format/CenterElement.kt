package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use css property 'margin'")
open class CenterElement : FormattingElement("center", false)

interface CenterElementProvider : IElement {
    fun center(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (CenterElement.() -> Unit)? = null
    ) = addChild(CenterElement().init(className = className, id = id, text = text, init = init))
}