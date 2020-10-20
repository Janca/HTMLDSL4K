package janca.dsl.html.provider

import janca.dsl.html.element.impl.struct.AnchorElementProvider
import janca.dsl.html.element.impl.struct.ArticleElementProvider
import janca.dsl.html.element.impl.struct.AsideElementProvider
import janca.dsl.html.element.impl.struct.BreakElementProvider
import janca.dsl.html.element.impl.struct.DetailsElementProvider
import janca.dsl.html.element.impl.struct.DivElementProvider
import janca.dsl.html.element.impl.struct.FooterElementProvider
import janca.dsl.html.element.impl.struct.HGroupElementProvider
import janca.dsl.html.element.impl.struct.HeaderElementProvider
import janca.dsl.html.element.impl.struct.HorizontalRuleElementProvider
import janca.dsl.html.element.impl.struct.MainElementProvider
import janca.dsl.html.element.impl.struct.NavElementProvider
import janca.dsl.html.element.impl.struct.ParagraphElementProvider
import janca.dsl.html.element.impl.struct.SectionElementProvider
import janca.dsl.html.element.impl.struct.SpanElementProvider

interface StructElementProvider :
    AnchorElementProvider,
    ArticleElementProvider,
    AsideElementProvider,
    BreakElementProvider,
    DetailsElementProvider,
    DivElementProvider,
    FooterElementProvider,
    HeadingElementProvider,
    HeaderElementProvider,
    HGroupElementProvider,
    HorizontalRuleElementProvider,
    MainElementProvider,
    NavElementProvider,
    ParagraphElementProvider,
    SectionElementProvider,
    SpanElementProvider