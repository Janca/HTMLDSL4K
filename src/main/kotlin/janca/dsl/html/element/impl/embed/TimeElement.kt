package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.DateTimeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class TimeElement : EmbeddedElement("time", false), PhrasingContentElementProvider,
        DateTimeAttributeProvider

interface TimeElementProvider : IElement {
    fun time(className: String? = null, id: String? = null, text: String? = null, init: (TimeElement.() -> Unit)? = null) = addChild(TimeElement().init(className = className, id = id, text = text, init = init))
}