package janca.dsl.html.element.impl.embed

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class MapElement : EmbeddedElement("map", false), AreaElementProvider
interface MapElementProvider : IElement {
    fun map(className: String? = null, id: String? = null, text: String? = null, init: (MapElement.() -> Unit)? = null) = addChild(MapElement().init(className = className, id = id, text = text, init = init))
}