package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.ArchiveAttributeProvider
import janca.dsl.html.attribute.BorderAttributeProvider
import janca.dsl.html.attribute.ClassidAttributeProvider
import janca.dsl.html.attribute.CodeBaseAttributeProvider
import janca.dsl.html.attribute.CodeTypeAttributeProvider
import janca.dsl.html.attribute.DataAttributeProvider
import janca.dsl.html.attribute.DeclareAttributeProvider
import janca.dsl.html.attribute.FormAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.StandbyAttributeProvider
import janca.dsl.html.attribute.TabIndexAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.UseMapAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class ObjectElement : EmbeddedElement("object", false),
    ParameterElementProvider,
    ArchiveAttributeProvider,
    BorderAttributeProvider,
    ClassidAttributeProvider,
    CodeBaseAttributeProvider,
    CodeTypeAttributeProvider,
    DataAttributeProvider,
    DeclareAttributeProvider,
    FormAttributeProvider,
    HeightAttributeProvider,
    NameAttributeProvider,
    StandbyAttributeProvider,
    TabIndexAttributeProvider,
    TypeAttributeProvider,
    UseMapAttributeProvider,
    WidthAttributeProvider

interface ObjectElementProvider : IElement {
    fun objectElement(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (ObjectElement.() -> Unit)? = null
    ) = addChild(ObjectElement().init(className = className, id = id, text = text, init = init))
}