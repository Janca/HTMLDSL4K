package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'abbr'")
open class AcronymElement : FormattingElement("acronym", false)

interface AcronymElementProvider : IElement {
    @Deprecated("Use 'abbr'", ReplaceWith("addChild(AbbreviationElement().init(className = className, id = id, text = text, init = init))", "janca.dsl.html.element.impl.format.AbbreviationElement", "janca.dsl.html.element.init"))
    fun acronym(className: String? = null, id: String? = null, text: String? = null, init: (AcronymElement.() -> Unit)? = null) = addChild(AcronymElement().init(className = className, id = id, text = text, init = init))
}