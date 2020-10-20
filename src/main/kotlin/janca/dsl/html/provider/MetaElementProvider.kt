package janca.dsl.html.provider

import janca.dsl.html.element.impl.meta.BaseElementProvider
import janca.dsl.html.element.impl.meta.BaseFontElementProvider
import janca.dsl.html.element.impl.meta.LinkElementProvider
import janca.dsl.html.element.impl.meta.StyleElementProvider
import janca.dsl.html.element.impl.meta.TitleElementProvider

interface MetaElementProvider :
    BaseElementProvider,
    BaseFontElementProvider,
    LinkElementProvider,
    janca.dsl.html.element.impl.meta.MetaElementProvider,
    StyleElementProvider,
    TitleElementProvider