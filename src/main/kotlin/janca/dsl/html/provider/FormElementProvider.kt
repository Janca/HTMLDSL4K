package janca.dsl.html.provider

import janca.dsl.html.element.impl.form.*

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