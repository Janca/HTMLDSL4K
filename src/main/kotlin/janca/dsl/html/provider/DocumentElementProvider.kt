package janca.dsl.html.provider

import janca.dsl.html.element.impl.document.BodyElementProvider
import janca.dsl.html.element.impl.document.HeadElementProvider

interface DocumentElementProvider :
        HeadElementProvider,
        BodyElementProvider