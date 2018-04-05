package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'object'")
open class AppletElement : EmbeddedElement("applet", false)

interface AppletElementProvider : IElement {
    @Deprecated("Use 'object'", ReplaceWith("addChild(ObjectElement().init(className = className, id = id, text = text, init = init))", "janca.dsl.html.element.impl.embed.ObjectElement", "janca.dsl.html.element.init"))
    fun applet(className: String? = null, id: String? = null, text: String? = null, init: (AppletElement.() -> Unit)? = null) = addChild(AppletElement().init(className = className, id = id, text = text, init = init))
}