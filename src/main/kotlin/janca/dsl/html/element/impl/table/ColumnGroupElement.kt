package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ColumnGroupElement : ITableElement("colgroup", false), ColumnElementProvider
interface ColumnGroupElementProvider : IElement {
    fun colgroup(className: String? = null, id: String? = null, text: String? = null, init: (ColumnGroupElement.() -> Unit)? = null) = addChild(ColumnGroupElement().init(className = className, id = id, text = text, init = init))
}