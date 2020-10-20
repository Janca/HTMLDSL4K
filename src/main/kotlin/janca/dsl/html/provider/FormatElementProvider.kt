package janca.dsl.html.provider

import janca.dsl.html.element.impl.format.AbbreviationElementProvider
import janca.dsl.html.element.impl.format.AcronymElementProvider
import janca.dsl.html.element.impl.format.AddressElementProvider
import janca.dsl.html.element.impl.format.BiDirectionIsolationElementProvider
import janca.dsl.html.element.impl.format.BiDirectionOverrideElementProvider
import janca.dsl.html.element.impl.format.BigElementProvider
import janca.dsl.html.element.impl.format.BlockQuoteElementProvider
import janca.dsl.html.element.impl.format.BoldElementProvider
import janca.dsl.html.element.impl.format.CenterElementProvider
import janca.dsl.html.element.impl.format.CiteElementProvider
import janca.dsl.html.element.impl.format.CodeElementProvider
import janca.dsl.html.element.impl.format.DefinitionElementProvider
import janca.dsl.html.element.impl.format.DeleteElementProvider
import janca.dsl.html.element.impl.format.EmphasisElementProvider
import janca.dsl.html.element.impl.format.FontElementProvider
import janca.dsl.html.element.impl.format.InsertedElementProvider
import janca.dsl.html.element.impl.format.ItalicElementProvider
import janca.dsl.html.element.impl.format.KeyboardElementProvider
import janca.dsl.html.element.impl.format.MarkElementProvider
import janca.dsl.html.element.impl.format.OutputElementProvider
import janca.dsl.html.element.impl.format.PreFormattedTextElementProvider
import janca.dsl.html.element.impl.format.ProgressElementProvider
import janca.dsl.html.element.impl.format.QuoteElementProvider
import janca.dsl.html.element.impl.format.RubyElementProvider
import janca.dsl.html.element.impl.format.RubyFallbackParenthesisProvider
import janca.dsl.html.element.impl.format.RubyTextElementProvider
import janca.dsl.html.element.impl.format.SampleElementProvider
import janca.dsl.html.element.impl.format.SmallElementProvider
import janca.dsl.html.element.impl.format.StrikeElementProvider
import janca.dsl.html.element.impl.format.StrikeThroughElementProvider
import janca.dsl.html.element.impl.format.StrongElementProvider
import janca.dsl.html.element.impl.format.SubscriptElementProvider
import janca.dsl.html.element.impl.format.SuperscriptElementProvider
import janca.dsl.html.element.impl.format.TeletextElementProvider
import janca.dsl.html.element.impl.format.UnderlineElementProvider
import janca.dsl.html.element.impl.format.VarElementProvider
import janca.dsl.html.element.impl.format.WordBreakOpportunityElementProvider

interface FormatElementProvider :
    AbbreviationElementProvider,
    AcronymElementProvider,
    AddressElementProvider,
    BiDirectionIsolationElementProvider,
    BiDirectionOverrideElementProvider,
    BigElementProvider,
    BlockQuoteElementProvider,
    BoldElementProvider,
    CenterElementProvider,
    CiteElementProvider,
    CodeElementProvider,
    DefinitionElementProvider,
    DeleteElementProvider,
    EmphasisElementProvider,
    FontElementProvider,
    InsertedElementProvider,
    ItalicElementProvider,
    KeyboardElementProvider,
    MarkElementProvider,
    OutputElementProvider,
    PreFormattedTextElementProvider,
    ProgressElementProvider,
    QuoteElementProvider,
    RubyElementProvider,
    RubyFallbackParenthesisProvider,
    RubyTextElementProvider,
    SampleElementProvider,
    SmallElementProvider,
    StrikeElementProvider,
    StrikeThroughElementProvider,
    StrongElementProvider,
    SubscriptElementProvider,
    SuperscriptElementProvider,
    TeletextElementProvider,
    UnderlineElementProvider,
    VarElementProvider,
    WordBreakOpportunityElementProvider