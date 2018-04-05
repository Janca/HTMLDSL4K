package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class BiDirectionOverrideElement : FormattingElement("bdo", false), PhrasingContentElementProvider
interface BiDirectionOverrideElementProvider : IElement {
    fun bdo(className: String? = null, id: String? = null, text: String? = null, init: (BiDirectionOverrideElement.() -> Unit)? = null) = addChild(BiDirectionOverrideElement().init(className = className, id = id, text = text, init = init))
}
