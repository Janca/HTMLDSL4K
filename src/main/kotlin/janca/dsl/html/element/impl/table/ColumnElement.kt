package janca.dsl.html.element.impl.table

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.BgColorAttributeProvider
import janca.dsl.html.attribute.CharAttributeProvider
import janca.dsl.html.attribute.CharOffAttributeProvider
import janca.dsl.html.attribute.SpanAttributeProvider
import janca.dsl.html.attribute.VAlignAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ColumnElement :
    ITableElement("col", false),
    AlignAttributeProvider,
    BgColorAttributeProvider,
    CharAttributeProvider,
    CharOffAttributeProvider,
    SpanAttributeProvider,
    VAlignAttributeProvider,
    WidthAttributeProvider

interface ColumnElementProvider : IElement {
    fun col(className: String? = null, id: String? = null, text: String? = null, init: ColumnElement.() -> Unit = {}) =
        addChild(ColumnElement().init(className = className, id = id, text = text, init = init))
}