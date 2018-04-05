package janca.dsl.html.element.impl.script

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class NoscriptElement : ScriptingElement("noscript", false)
interface NoscriptElementProvider : IElement {
    fun noscript(className: String? = null, id: String? = null, text: String? = null, init: (NoscriptElement.() -> Unit)? = null) = addChild(NoscriptElement().init(className = className, id = id, text = text, init = init))
}