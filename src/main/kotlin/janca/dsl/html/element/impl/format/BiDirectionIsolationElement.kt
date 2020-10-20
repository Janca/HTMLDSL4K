package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class BiDirectionIsolationElement : FormattingElement("bdi", false), PhrasingContentElementProvider
interface BiDirectionIsolationElementProvider : IElement {
    fun bdi(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (BiDirectionIsolationElement.() -> Unit)? = null
    ) = addChild(BiDirectionIsolationElement().init(className = className, id = id, text = text, init = init))
}