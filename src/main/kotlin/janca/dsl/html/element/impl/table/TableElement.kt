package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableElement : ITableElement("table", false), CaptionElementProvider, ColumnGroupElementProvider, TableHeadElementProvider, TableBodyElementProvider, TableRowElementProvider, TableFooterElementProvider
interface TableElementProvider : IElement {
    fun table(className: String? = null, id: String? = null, text: String? = null, init: (TableElement.() -> Unit)? = null) = addChild(TableElement().init(className = className, id = id, text = text, init = init))
}