package janca.dsl.html.provider

import janca.dsl.html.element.impl.form.ButtonElementProvider
import janca.dsl.html.element.impl.form.DataListElementProvider
import janca.dsl.html.element.impl.form.FieldSetElementProvider
import janca.dsl.html.element.impl.form.InputElementProvider
import janca.dsl.html.element.impl.form.KeygenElementProvider
import janca.dsl.html.element.impl.form.LabelElementProvider
import janca.dsl.html.element.impl.form.LegendElementProvider
import janca.dsl.html.element.impl.form.MeterElementProvider
import janca.dsl.html.element.impl.form.OptGroupElementProvider
import janca.dsl.html.element.impl.form.OptionElementProvider
import janca.dsl.html.element.impl.form.SelectElementProvider
import janca.dsl.html.element.impl.form.TextAreaElementProvider

interface FormElementProvider :
    ButtonElementProvider,
    DataListElementProvider,
    FieldSetElementProvider,
    janca.dsl.html.element.impl.form.FormElementProvider, //TODO make better
    InputElementProvider,
    KeygenElementProvider,
    LabelElementProvider,
    LegendElementProvider,
    MeterElementProvider,
    OptGroupElementProvider,
    OptionElementProvider,
    SelectElementProvider,
    TextAreaElementProvider