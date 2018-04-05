package janca.dsl.html.element

import janca.dsl.html.element.impl.document.DocTypeElement
import janca.dsl.html.element.impl.document.HTMLElement

fun htmlTemplate(init: DSLTemplateElement.() -> Unit): DSLTemplateElement = DSLTemplateElement().also(init)

@ElementDsl
fun html(init: (@ElementDsl HTMLElement.() -> Unit)): HTMLElement = HTMLElement().also(init)

@ElementDsl
fun doctype(type: String = "html", init: (@ElementDsl DocTypeElement.() -> Unit)): DocTypeElement = DocTypeElement(type).also(init)