package janca.dsl.html.element.impl.form

import janca.dsl.html.attribute.AcceptAttributeProvider
import janca.dsl.html.attribute.AccessKeyAttributeProvider
import janca.dsl.html.attribute.AutoCompleteAttributeProvider
import janca.dsl.html.attribute.AutoFocusAttributeProvider
import janca.dsl.html.attribute.AutocorrectAttributeProvider
import janca.dsl.html.attribute.CaptureAttributeProvider
import janca.dsl.html.attribute.CheckedAttributeProvider
import janca.dsl.html.attribute.DisabledAttributeProvider
import janca.dsl.html.attribute.FormActionAttributeProvider
import janca.dsl.html.attribute.FormAttributeProvider
import janca.dsl.html.attribute.FormEncTypeAttributeProvider
import janca.dsl.html.attribute.FormMethodAttributeProvider
import janca.dsl.html.attribute.FormNoValidateAttributeProvider
import janca.dsl.html.attribute.FormTargetAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.IncrementalAttributeProvider
import janca.dsl.html.attribute.InputModeAttributeProvider
import janca.dsl.html.attribute.ListAttributeProvider
import janca.dsl.html.attribute.MaxAttributeProvider
import janca.dsl.html.attribute.MaxLengthAttributeProvider
import janca.dsl.html.attribute.MinAttributeProvider
import janca.dsl.html.attribute.MinLengthAttributeProvider
import janca.dsl.html.attribute.MozActionHintAttributeProvider
import janca.dsl.html.attribute.MultipleAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.PatternAttributeProvider
import janca.dsl.html.attribute.PlaceholderAttributeProvider
import janca.dsl.html.attribute.ReadonlyAttributeProvider
import janca.dsl.html.attribute.RequiredAttributeProvider
import janca.dsl.html.attribute.ResultsAttributeProvider
import janca.dsl.html.attribute.SelectionDirectionAttributeProvider
import janca.dsl.html.attribute.SelectionEndAttributeProvider
import janca.dsl.html.attribute.SelectionStartAttributeProvider
import janca.dsl.html.attribute.SizesAttributeProvider
import janca.dsl.html.attribute.SpellcheckAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.StepAttributeProvider
import janca.dsl.html.attribute.TabIndexAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.attribute.UseMapAttributeProvider
import janca.dsl.html.attribute.ValueTypeAttributeProvider
import janca.dsl.html.attribute.WebKitDirectoryAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.attribute.XMozErrormessageAttributeProvider
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
    fun input(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (InputElement.() -> Unit)? = null
    ) = addChild(InputElement().init(className = className, id = id, text = text, init = init))
}