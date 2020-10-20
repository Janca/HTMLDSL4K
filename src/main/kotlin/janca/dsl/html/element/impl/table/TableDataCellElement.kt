package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AbbrAttributeProvider
import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.AxisAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.CharAttributeProvider
import janca.dsl.html.attribute.CharOffAttributeProvider
import janca.dsl.html.attribute.ColSpanAttributeProvider
import janca.dsl.html.attribute.HeadersAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.RowSpanAttributeProvider
import janca.dsl.html.attribute.ScopeAttributeProvider
import janca.dsl.html.attribute.VAlignAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class TableDataCellElement :
    ITableElement("td", false),
    FlowContentElementProvider,
    AbbrAttributeProvider,
    AlignAttributeProvider,
    AxisAttributeProvider,
    BgColorAttributeProvider,
    CharAttributeProvider,
    CharOffAttributeProvider,
    ColSpanAttributeProvider,
    HeadersAttributeProvider,
    HeightAttributeProvider,
    RowSpanAttributeProvider,
    ScopeAttributeProvider,
    VAlignAttributeProvider,
    WidthAttributeProvider

interface TableDataCellElementProvider : IElement {
    fun td(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: TableDataCellElement.() -> Unit = {}
    ) = addChild(TableDataCellElement().init(className = className, id = id, text = text, init = init))
}