package janca.dsl.html.element.impl.list

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class MenuElement : ListElement("menu", false)
interface MenuElementProvider : IElement {
    fun menu(className: String? = null, id: String? = null, text: String? = null, init: (MenuElement.() -> Unit)? = null) = addChild(MenuElement().init(className = className, id = id, text = text, init = init))
}