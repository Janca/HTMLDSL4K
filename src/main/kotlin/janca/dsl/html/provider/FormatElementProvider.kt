package janca.dsl.html.provider

import janca.dsl.html.element.impl.format.*

interface FormatElementProvider :
        AbbreviationElementProvider,
        AcronymElementProvider,
        AddressElementProvider,
        BiDirectionIsolationElementProvider,
        BiDirectionOverrideElementProvider,
        BigElementProvider,
        BlockquoteElementProvider,
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