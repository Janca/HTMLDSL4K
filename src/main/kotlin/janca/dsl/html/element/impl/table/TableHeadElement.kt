package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableHeadElement : ITableElement("thead", false), TableRowElementProvider
interface TableHeadElementProvider : IElement {
    fun thead(className: String? = null, id: String? = null, text: String? = null, init: TableHeadElement.() -> Unit = {}) = addChild(TableHeadElement().init(className = className, id = id, text = text, init = init))
}