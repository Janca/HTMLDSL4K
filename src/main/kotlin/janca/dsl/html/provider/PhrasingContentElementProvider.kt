package janca.dsl.html.provider

import janca.dsl.html.element.impl.embed.*
import janca.dsl.html.element.impl.form.*
import janca.dsl.html.element.impl.format.*
import janca.dsl.html.element.impl.struct.AnchorElementProvider
import janca.dsl.html.element.impl.struct.BreakElementProvider
import janca.dsl.html.element.impl.struct.SpanElementProvider

interface PhrasingContentElementProvider :
        AnchorElementProvider,
        AbbreviationElementProvider,
        AudioElementProvider,
        BoldElementProvider,
        BiDirectionOverrideElementProvider,
        BreakElementProvider,
        ButtonElementProvider,
        CanvasElementProvider,
        CiteElementProvider,
        CodeElementProvider,
        DataListElementProvider,
        DefinitionElementProvider,
        DeleteElementProvider,
        EmphasisElementProvider,
        EmbedElementProvider,
        ItalicElementProvider,
        IFrameElementProvider,
        ImageElementProvider,
        InsertedElementProvider,
        InputElementProvider,
        KeyboardElementProvider,
        KeygenElementProvider,
        LabelElementProvider,
        MarkElementProvider,
        MetaElementProvider,
        MeterElementProvider,
        MapElementProvider,
        ScriptElementProvider,
        SelectElementProvider,
        SmallElementProvider,
        SpanElementProvider,
        StrongElementProvider,
        SubscriptElementProvider,
        SuperscriptElementProvider,
        TextAreaElementProvider,
        SvgElementProvider