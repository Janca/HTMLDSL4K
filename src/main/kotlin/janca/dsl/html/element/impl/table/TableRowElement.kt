package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableRowElement : ITableElement("tr", false), TableDataCellElementProvider, TableHeaderCellElementProvider
interface TableRowElementProvider : IElement {
    fun tr(className: String? = null, id: String? = null, text: String? = null, init: (TableRowElement.() -> Unit)? = null) = addChild(TableRowElement().init(className = className, id = id, text = text, init = init))
}