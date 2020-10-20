package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.RoleAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.FlowContentElementProvider

open class MainElement : StructuralElement("main", false), FlowContentElementProvider, RoleAttributeProvider
interface MainElementProvider : IElement {
    fun main(
        role: String = "main",
        id: String? = null,
        className: String? = null,
        text: String? = null,
        init: (MainElement.() -> Unit)? = null
    ) =
        addChild(MainElement().init(text, className, id) {
            init?.invoke(this)
            this.role = role
        })
}