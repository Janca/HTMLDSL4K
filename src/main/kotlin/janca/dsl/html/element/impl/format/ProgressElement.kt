package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class ProgressElement : FormattingElement("progress", false), PhrasingContentElementProvider
interface ProgressElementProvider : IElement {
    fun progress(className: String? = null, id: String? = null, text: String? = null, init: (ProgressElement.() -> Unit)? = null) = addChild(ProgressElement().init(className = className, id = id, text = text, init = init))
}