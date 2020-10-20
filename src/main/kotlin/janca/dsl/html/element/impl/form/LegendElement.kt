package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class LegendElement : IFormElement("legend", false), PhrasingContentElementProvider
interface LegendElementProvider : IElement {
    fun legend(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (LegendElement.() -> Unit)? = null
    ) = addChild(LegendElement().init(className = className, id = id, text = text, init = init))
}