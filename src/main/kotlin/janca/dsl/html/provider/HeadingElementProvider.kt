package janca.dsl.html.provider

import janca.dsl.html.element.impl.struct.H1ElementProvider
import janca.dsl.html.element.impl.struct.H2ElementProvider
import janca.dsl.html.element.impl.struct.H3ElementProvider
import janca.dsl.html.element.impl.struct.H4ElementProvider
import janca.dsl.html.element.impl.struct.H5ElementProvider
import janca.dsl.html.element.impl.struct.H6ElementProvider

interface HeadingElementProvider :
    H1ElementProvider,
    H2ElementProvider,
    H3ElementProvider,
    H4ElementProvider,
    H5ElementProvider,
    H6ElementProvider