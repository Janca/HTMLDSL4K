package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

@Deprecated("Use 'del' for deleted contents 's' for all other use cases.")
open class StrikeElement : FormattingElement("strike", false), PhrasingContentElementProvider

interface StrikeElementProvider : IElement {
    @Suppress("DeprecatedCallableAddReplaceWith")
    @Deprecated("Use 'del' for deleted contents 's' for all other use cases.")
    fun strike(className: String? = null, id: String? = null, text: String? = null, init: (StrikeElement.() -> Unit)? = null) = addChild(StrikeElement().init(className = className, id = id, text = text, init = init))
}