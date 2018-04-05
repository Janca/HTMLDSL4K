package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.SizeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.impl.form.ButtonElementProvider
import janca.dsl.html.element.impl.form.InputElementProvider
import janca.dsl.html.element.impl.struct.AnchorElementProvider
import janca.dsl.html.element.init

open class CanvasElement : EmbeddedElement("canvas", false), SizeAttributeProvider, AnchorElementProvider, ButtonElementProvider, InputElementProvider
interface CanvasElementProvider : IElement {
    fun canvas(className: String? = null, id: String? = null, text: String? = null, init: (CanvasElement.() -> Unit)? = null) = addChild(CanvasElement().init(className = className, id = id, text = text, init = init))
}