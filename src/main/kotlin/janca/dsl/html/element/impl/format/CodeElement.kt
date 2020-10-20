package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class CodeElement : FormattingElement("code", false), PhrasingContentElementProvider
interface CodeElementProvider : IElement {
    fun code(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (CodeElement.() -> Unit)? = null
    ) = addChild(CodeElement().init(className = className, id = id, text = text, init = init))
}