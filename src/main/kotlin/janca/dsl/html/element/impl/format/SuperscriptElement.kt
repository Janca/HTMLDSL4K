package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class SuperscriptElement : FormattingElement("sup", false)
interface SuperscriptElementProvider : IElement {
    fun sup(className: String? = null, id: String? = null, text: String? = null, init: (SuperscriptElement.() -> Unit)? = null) = addChild(SuperscriptElement().init(className = className, id = id, text = text, init = init))
}