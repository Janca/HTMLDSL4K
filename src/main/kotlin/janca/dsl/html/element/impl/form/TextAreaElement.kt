package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.AutoCapitalizeAttributeProvider
import janca.dsl.html.attribute.AutoCompleteAttributeProvider
import janca.dsl.html.attribute.AutoFocusAttributeProvider
import janca.dsl.html.attribute.ColsAttributeProvider
import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.FormAttributeProvider
import janca.dsl.html.attribute.MaxLengthAttributeProvider
import janca.dsl.html.attribute.MinLengthAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.PlaceholderAttributeProvider
import janca.dsl.html.attribute.ReadonlyAttributeProvider
import janca.dsl.html.attribute.RequiredAttributeProvider
import janca.dsl.html.attribute.RowsAttributeProvider
import janca.dsl.html.attribute.SpellcheckAttributeProvider
import janca.dsl.html.attribute.WrapAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class TextAreaElement : IFormElement("textarea", false),
    AutoCapitalizeAttributeProvider,
    AutoCompleteAttributeProvider,
    AutoFocusAttributeProvider,
    ColsAttributeProvider,
    DisabledAttributeProvider,
    FormAttributeProvider,
    MaxLengthAttributeProvider,
    MinLengthAttributeProvider,
    NameAttributeProvider,
    PlaceholderAttributeProvider,
    ReadonlyAttributeProvider,
    RequiredAttributeProvider,
    RowsAttributeProvider,
    SpellcheckAttributeProvider,
    WrapAttributeProvider

interface TextAreaElementProvider : IElement {
    fun textarea(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (TextAreaElement.() -> Unit)? = null
    ) = addChild(TextAreaElement().init(className = className, id = id, text = text, init = init))
}