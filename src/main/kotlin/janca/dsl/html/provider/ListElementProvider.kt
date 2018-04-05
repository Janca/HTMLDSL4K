package janca.dsl.html.provider

import janca.dsl.html.element.impl.list.DefinitionDescriptionElementProvider
import janca.dsl.html.element.impl.list.MenuElementProvider
import janca.dsl.html.element.impl.list.OrderedListElementProvider
import janca.dsl.html.element.impl.list.UnorderedListElementProvider

interface ListElementProvider :
        UnorderedListElementProvider,
        OrderedListElementProvider,
        MenuElementProvider,
        DefinitionDescriptionElementProvider