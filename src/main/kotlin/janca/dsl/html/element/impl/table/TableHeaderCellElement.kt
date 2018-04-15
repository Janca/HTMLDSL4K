package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class TableHeaderCellElement :
        ITableElement("th", false),
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

interface TableHeaderCellElementProvider : IElement {
    fun th(className: String? = null, id: String? = null, text: String? = null, init: TableHeaderCellElement.() -> Unit = {}) = addChild(TableHeaderCellElement().init(className = className, id = id, text = text, init = init))
}