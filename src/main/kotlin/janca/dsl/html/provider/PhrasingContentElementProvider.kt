package janca.dsl.html.provider

import janca.dsl.html.element.impl.embed.AudioElementProvider
import janca.dsl.html.element.impl.embed.CanvasElementProvider
import janca.dsl.html.element.impl.embed.EmbedElementProvider
import janca.dsl.html.element.impl.embed.IFrameElementProvider
import janca.dsl.html.element.impl.embed.ImageElementProvider
import janca.dsl.html.element.impl.embed.MapElementProvider
import janca.dsl.html.element.impl.embed.SvgElementProvider
import janca.dsl.html.element.impl.form.ButtonElementProvider
import janca.dsl.html.element.impl.form.DataListElementProvider
import janca.dsl.html.element.impl.form.InputElementProvider
import janca.dsl.html.element.impl.form.KeygenElementProvider
import janca.dsl.html.element.impl.form.LabelElementProvider
import janca.dsl.html.element.impl.form.MeterElementProvider
import janca.dsl.html.element.impl.form.SelectElementProvider
import janca.dsl.html.element.impl.form.TextAreaElementProvider
import janca.dsl.html.element.impl.format.AbbreviationElementProvider
import janca.dsl.html.element.impl.format.BiDirectionOverrideElementProvider
import janca.dsl.html.element.impl.format.BoldElementProvider
import janca.dsl.html.element.impl.format.CiteElementProvider
import janca.dsl.html.element.impl.format.CodeElementProvider
import janca.dsl.html.element.impl.format.DefinitionElementProvider
import janca.dsl.html.element.impl.format.DeleteElementProvider
import janca.dsl.html.element.impl.format.EmphasisElementProvider
import janca.dsl.html.element.impl.format.InsertedElementProvider
import janca.dsl.html.element.impl.format.ItalicElementProvider
import janca.dsl.html.element.impl.format.KeyboardElementProvider
import janca.dsl.html.element.impl.format.MarkElementProvider
import janca.dsl.html.element.impl.format.SmallElementProvider
import janca.dsl.html.element.impl.format.StrongElementProvider
import janca.dsl.html.element.impl.format.SubscriptElementProvider
import janca.dsl.html.element.impl.format.SuperscriptElementProvider
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