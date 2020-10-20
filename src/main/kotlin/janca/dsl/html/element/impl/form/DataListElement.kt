package janca.dsl.html.element.impl.form

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.PhrasingContentElementProvider

open class DataListElement : IFormElement("datalist", false), PhrasingContentElementProvider, OptionElementProvider
interface DataListElementProvider : IElement {
    fun datalist(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (DataListElement.() -> Unit)? = null
    ) = addChild(DataListElement().init(className = className, id = id, text = text, init = init))
}