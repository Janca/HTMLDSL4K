package janca.dsl.html.provider

import janca.dsl.html.element.impl.document.DocTypeElementProvider
import janca.dsl.html.element.impl.list.DefinitionDescriptionElementProvider
import janca.dsl.html.element.impl.list.DefinitionTermElementProvider
import janca.dsl.html.element.impl.list.ListItemElementProvider

interface AllElementProvider :
    PhrasingContentElementProvider,
    FlowContentElementProvider,
    DocTypeElementProvider,
    DocumentElementProvider,
    EmbeddedElementProvider,
    FormatElementProvider,
    FormElementProvider,
    HeadingElementProvider,
    ListElementProvider,
    MetaElementProvider,
    ScriptElementProvider,
    SimpleTextProvider,
    StructElementProvider,
    TableElementProvider,
    ListItemElementProvider,
    DefinitionTermElementProvider,
    DefinitionDescriptionElementProvider