package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.*
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
    fun td(className: String? = null, id: String? = null, text: String? = null, init: TableDataCellElement.() -> Unit = {}) = addChild(TableDataCellElement().init(className = className, id = id, text = text, init = init))
}