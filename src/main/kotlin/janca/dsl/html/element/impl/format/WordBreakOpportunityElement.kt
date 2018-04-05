package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class WordBreakOpportunityElement : FormattingElement("wbr", true)
interface WordBreakOpportunityElementProvider : IElement {
    fun wbr(className: String? = null, id: String? = null, text: String? = null, init: (WordBreakOpportunityElement.() -> Unit)? = null) = addChild(WordBreakOpportunityElement().init(className = className, id = id, text = text, init = init))
}