package janca.dsl.html.element.impl.script

import janca.dsl.html.attribute.DeferAttributeProvider
import janca.dsl.html.attribute.HrefAttributeProvider
import janca.dsl.html.attribute.SrcAttributeProvider
import janca.dsl.html.attribute.TypeAttributeProvider
import janca.dsl.html.element.Element

open class ScriptingElement(tag: String, isAutoClosing: Boolean = false) : Element(tag, isAutoClosing),
    HrefAttributeProvider, TypeAttributeProvider, SrcAttributeProvider, DeferAttributeProvider