package janca.dsl.html.element.impl.struct

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class ArticleElement : StructuralElement("article", false), FlowContentElementProvider
interface ArticleElementProvider : IElement {
    fun article(className: String? = null, id: String? = null, text: String? = null, init: (ArticleElement.() -> Unit)? = null) = addChild(ArticleElement().init(className = className, id = id, text = text, init = init))
}