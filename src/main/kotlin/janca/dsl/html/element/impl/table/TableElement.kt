package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.BorderAttributeProvider
import janca.dsl.html.attribute.CellPaddingAttributeProvider
import janca.dsl.html.attribute.CellSpacingAttributeProvider
import janca.dsl.html.attribute.FrameAttributeProvider
import janca.dsl.html.attribute.RulesAttributeProvider
import janca.dsl.html.attribute.SummaryAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableElement :
    ITableElement("table", false),
    CaptionElementProvider,
    ColumnGroupElementProvider,
    TableHeadElementProvider,
    TableBodyElementProvider,
    TableRowElementProvider,
    TableFooterElementProvider,
    AlignAttributeProvider,
    BgColorAttributeProvider,
    BorderAttributeProvider,
    CellPaddingAttributeProvider,
    CellSpacingAttributeProvider,
    FrameAttributeProvider,
    RulesAttributeProvider,
    SummaryAttributeProvider,
    WidthAttributeProvider

interface TableElementProvider : IElement {
    fun table(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TableElement.() -> Unit)? = null
    ) = addChild(TableElement().init(className = className, id = id, text = text, init = init))
}