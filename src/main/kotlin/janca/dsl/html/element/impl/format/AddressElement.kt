package janca.dsl.html.element.impl.format

import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.EmbeddedElementProvider
import janca.dsl.html.provider.FormElementProvider
import janca.dsl.html.provider.FormatElementProvider
import janca.dsl.html.provider.ListElementProvider
import janca.dsl.html.provider.PhrasingContentElementProvider
import janca.dsl.html.provider.ScriptElementProvider
import janca.dsl.html.provider.StructElementProvider
import janca.dsl.html.provider.TableElementProvider

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
    fun address(
        text: String? = null,
        className: String? = null,
        id: String? = null,
        init: (AddressElement.() -> Unit)? = null
    ) = addChild(AddressElement().init(className = className, id = id, text = text, init = init))
}