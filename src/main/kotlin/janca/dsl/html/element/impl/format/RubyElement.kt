package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class RubyElement : FormattingElement("ruby", false), PhrasingContentElementProvider
interface RubyElementProvider : IElement {
    fun ruby(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (RubyElement.() -> Unit)? = null
    ) = addChild(RubyElement().init(className = className, id = id, text = text, init = init))
}