package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.*
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
    fun objectElement(className: String? = null, id: String? = null, text: String? = null, init: (ObjectElement.() -> Unit)? = null) = addChild(ObjectElement().init(className = className, id = id, text = text, init = init))
}