package janca.dsl.html.element.impl.list

import janca.dsl.html.attribute.LabelAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class MenuElement : ListElement("menu", false),
    LabelAttributeProvider,
    TypeAttributeProvider

interface MenuElementProvider : IElement {
    fun menu(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (MenuElement.() -> Unit)? = null
    ) = addChild(MenuElement().init(className = className, id = id, text = text, init = init))
}