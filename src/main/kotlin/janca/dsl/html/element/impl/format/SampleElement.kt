package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class SampleElement : FormattingElement("samp", false), PhrasingContentElementProvider
interface SampleElementProvider : IElement {
    fun samp(className: String? = null, id: String? = null, text: String? = null, init: (SampleElement.() -> Unit)? = null) = addChild(SampleElement().init(className = className, id = id, text = text, init = init))
}