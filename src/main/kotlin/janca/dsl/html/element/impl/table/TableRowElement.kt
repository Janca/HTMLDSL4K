package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.CharAttributeProvider
import janca.dsl.html.attribute.CharOffAttributeProvider
import janca.dsl.html.attribute.VAlignAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableRowElement :
    ITableElement("tr", false),
    TableDataCellElementProvider,
    TableHeaderCellElementProvider,
    AlignAttributeProvider,
    BgColorAttributeProvider,
    CharAttributeProvider,
    CharOffAttributeProvider,
    VAlignAttributeProvider

interface TableRowElementProvider : IElement {
    fun tr(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TableRowElement.() -> Unit)? = null
    ) = addChild(TableRowElement().init(className = className, id = id, text = text, init = init))
}