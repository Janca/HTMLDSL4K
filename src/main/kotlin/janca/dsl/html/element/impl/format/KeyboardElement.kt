package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class KeyboardElement : FormattingElement("kbd", false), PhrasingContentElementProvider
interface KeyboardElementProvider : IElement {
    fun kbd(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (KeyboardElement.() -> Unit)? = null
    ) = addChild(KeyboardElement().init(className = className, id = id, text = text, init = init))
}