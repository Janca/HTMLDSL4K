package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class VarElement : FormattingElement("var", false), PhrasingContentElementProvider
interface VarElementProvider : IElement {
    fun varElem(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (VarElement.() -> Unit)? = null
    ) = addChild(VarElement().init(className = className, id = id, text = text, init = init))
}