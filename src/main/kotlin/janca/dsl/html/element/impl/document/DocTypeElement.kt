package janca.dsl.html.element.impl.document

import janca.dsl.html.element.Element
import janca.dsl.html.element.IElement

class DocTypeElement(docType: String) : Element("!DOCTYPE", true), HTMLElementProvider {
    init {
        this[docType] = ""
    }
}

interface DocTypeElementProvider : IElement {
    fun doctype(type: String = "html", init: (DocTypeElement.() -> Unit)? = null) = addChild(DocTypeElement(type).also { init?.invoke(it) })
}