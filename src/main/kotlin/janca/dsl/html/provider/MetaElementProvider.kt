package janca.dsl.html.provider

import janca.dsl.html.element.impl.meta.*

interface MetaElementProvider :
        BaseElementProvider,
        BaseFontElementProvider,
        LinkElementProvider,
        janca.dsl.html.element.impl.meta.MetaElementProvider,
        StyleElementProvider,
        TitleElementProvider