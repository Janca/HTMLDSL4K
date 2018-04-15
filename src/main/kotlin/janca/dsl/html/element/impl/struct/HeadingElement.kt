package janca.dsl.html.element.impl.struct

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.provider.PhrasingContentElementProvider

open class HeadingElement(tag: String) : StructuralElement(tag, false), AlignAttributeProvider, PhrasingContentElementProvider