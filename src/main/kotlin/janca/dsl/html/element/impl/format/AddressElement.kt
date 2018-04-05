package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.*

open class AddressElement :
        FormattingElement("address", false),
        PhrasingContentElementProvider,
        EmbeddedElementProvider,
        FormElementProvider,
        FormatElementProvider,
        ListElementProvider,
        ScriptElementProvider,
        StructElementProvider,
        TableElementProvider

interface AddressElementProvider : IElement {
    fun address(className: String? = null, id: String? = null, text: String? = null, init: (AddressElement.() -> Unit)? = null) = addChild(AddressElement().init(className = className, id = id, text = text, init = init))
}