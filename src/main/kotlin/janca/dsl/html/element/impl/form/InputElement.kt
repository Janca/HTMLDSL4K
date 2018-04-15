package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.*
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

open class InputElement : IFormElement("input", true),
        TypeAttributeProvider,
        AcceptAttributeProvider,
        AccessKeyAttributeProvider,
        AutoCompleteAttributeProvider,
        AutoFocusAttributeProvider,
        CaptureAttributeProvider,
        CheckedAttributeProvider,
        DisabledAttributeProvider,
        FormAttributeProvider,
        FormActionAttributeProvider,
        FormEncTypeAttributeProvider,
        FormMethodAttributeProvider,
        FormNoValidateAttributeProvider,
        FormTargetAttributeProvider,
        HeightAttributeProvider,
        InputModeAttributeProvider,
        ListAttributeProvider,
        MaxAttributeProvider,
        MaxLengthAttributeProvider,
        MinLengthAttributeProvider,
        MinAttributeProvider,
        MultipleAttributeProvider,
        NameAttributeProvider,
        PatternAttributeProvider,
        PlaceholderAttributeProvider,
        ReadonlyAttributeProvider,
        RequiredAttributeProvider,
        SelectionDirectionAttributeProvider,
        SelectionEndAttributeProvider,
        SelectionStartAttributeProvider,
        SizesAttributeProvider,
        SpellcheckAttributeProvider,
        SrcAttributeProvider,
        StepAttributeProvider,
        TabIndexAttributeProvider,
        UseMapAttributeProvider,
        ValueTypeAttributeProvider,
        WidthAttributeProvider,
        AutocorrectAttributeProvider,
        IncrementalAttributeProvider,
        MozActionHintAttributeProvider,
        ResultsAttributeProvider,
        WebKitDirectoryAttributeProvider,
        XMozErrormessageAttributeProvider


interface InputElementProvider : IElement {
    fun input(className: String? = null, id: String? = null, text: String? = null, init: (InputElement.() -> Unit)? = null) = addChild(InputElement().init(className = className, id = id, text = text, init = init))
}