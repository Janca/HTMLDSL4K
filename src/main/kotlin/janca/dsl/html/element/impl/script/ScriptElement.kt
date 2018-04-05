package janca.dsl.html.element.impl.script

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ScriptElement : ScriptingElement("script", false)
interface ScriptElementProvider : IElement {
    fun script(className: String? = null, id: String? = null, text: String? = null, init: (ScriptElement.() -> Unit)? = null) = addChild(ScriptElement().init(className = className, id = id, text = text, init = init))
}