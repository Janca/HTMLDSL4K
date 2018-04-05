package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class OutputElement : FormattingElement("output", false), PhrasingContentElementProvider
interface OutputElementProvider : IElement {
    fun output(className: String? = null, id: String? = null, text: String? = null, init: (OutputElement.() -> Unit)? = null) = addChild(OutputElement().init(className = className, id = id, text = text, init = init))
}