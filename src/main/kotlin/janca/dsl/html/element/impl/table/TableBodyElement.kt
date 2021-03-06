package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.CharAttributeProvider
import janca.dsl.html.attribute.CharOffAttributeProvider
import janca.dsl.html.attribute.VAlignAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TableBodyElement :
    ITableElement("tbody", false),
    TableRowElementProvider,
    AlignAttributeProvider,
    BgColorAttributeProvider,
    CharAttributeProvider,
    CharOffAttributeProvider,
    VAlignAttributeProvider

interface TableBodyElementProvider : IElement {
    fun tbody(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TableBodyElement.() -> Unit)? = null
    ) = addChild(TableBodyElement().init(className = className, id = id, text = text, init = init))
}