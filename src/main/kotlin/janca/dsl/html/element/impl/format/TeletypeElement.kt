package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

@Deprecated("Try  'code', 'kbd', 'var', or 'samp'")
open class TeletypeElement : FormattingElement("tt", false), PhrasingContentElementProvider

interface TeletextElementProvider : IElement {
    @Suppress("DeprecatedCallableAddReplaceWith")
    @Deprecated("Try  'code', 'kbd', 'var', or 'samp'")
    fun tt(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TeletypeElement.() -> Unit)? = null
    ) = addChild(TeletypeElement().init(className = className, id = id, text = text, init = init))
}