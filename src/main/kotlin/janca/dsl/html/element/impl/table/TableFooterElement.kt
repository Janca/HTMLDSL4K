package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.CharAttributeProvider
import janca.dsl.html.attribute.CharOffAttributeProvider
import janca.dsl.html.attribute.VAlignAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableFooterElement :
    ITableElement("tfoot", false),
    TableRowElementProvider,
    AlignAttributeProvider,
    BgColorAttributeProvider,
    CharAttributeProvider,
    CharOffAttributeProvider,
    VAlignAttributeProvider

interface TableFooterElementProvider : IElement {
    fun tfoot(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: TableFooterElement.() -> Unit = {}
    ) = addChild(TableFooterElement().init(className = className, id = id, text = text, init = init))
}