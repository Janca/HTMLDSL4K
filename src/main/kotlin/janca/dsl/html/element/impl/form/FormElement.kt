package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.AcceptAttributeProvider
import janca.dsl.html.attribute.AcceptCharsetAttributeProvider
import janca.dsl.html.attribute.AutoCapitalizeAttributeProvider
import janca.dsl.html.attribute.AutoCompleteAttributeProvider
import janca.dsl.html.attribute.EnctypeAttributeProvider
import janca.dsl.html.attribute.MethodAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.NoValidateAttributeProvider
import janca.dsl.html.attribute.TargetAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init
import janca.dsl.html.provider.EmbeddedElementProvider
import janca.dsl.html.provider.FormatElementProvider
import janca.dsl.html.provider.HeadingElementProvider
import janca.dsl.html.provider.ListElementProvider
import janca.dsl.html.provider.ScriptElementProvider
import janca.dsl.html.provider.StructElementProvider
import janca.dsl.html.provider.TableElementProvider

open class FormElement : IFormElement("form", false), EmbeddedElementProvider, FormatElementProvider,
    HeadingElementProvider, ListElementProvider, ScriptElementProvider, StructElementProvider, TableElementProvider,
    AcceptAttributeProvider,
    AcceptCharsetAttributeProvider,
    AutoCapitalizeAttributeProvider,
    AutoCompleteAttributeProvider,
    EnctypeAttributeProvider,
    MethodAttributeProvider,
    NameAttributeProvider,
    NoValidateAttributeProvider,
    TargetAttributeProvider

interface FormElementProvider : IElement {
    fun form(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (FormElement.() -> Unit)? = null
    ) = addChild(FormElement().init(className = className, id = id, text = text, init = init))
}