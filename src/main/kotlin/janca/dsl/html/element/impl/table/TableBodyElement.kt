package janca.dsl.html.element.impl.table

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableBodyElement : ITableElement("tbody", false), TableRowElementProvider
interface TableBodyElementProvider : IElement {
    fun tbody(className: String? = null, id: String? = null, text: String? = null, init: (TableBodyElement.() -> Unit)? = null) = addChild(TableBodyElement().init(className = className, id = id, text = text, init = init))
}