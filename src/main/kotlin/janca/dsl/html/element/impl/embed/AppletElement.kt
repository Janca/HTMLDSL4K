package janca.dsl.html.element.impl.embed

import janca.dsl.html.attribute.AlignAttributeProvider
import janca.dsl.html.attribute.AltAttributeProvider
import janca.dsl.html.attribute.ArchiveAttributeProvider
import janca.dsl.html.attribute.CodeAttributeProvider
import janca.dsl.html.attribute.DataFldAttributeProvider
import janca.dsl.html.attribute.DataSrcAttributeProvider
import janca.dsl.html.attribute.HSpaceAttributeProvider
import janca.dsl.html.attribute.HeightAttributeProvider
import janca.dsl.html.attribute.MayScriptAttributeProvider
import janca.dsl.html.attribute.NameAttributeProvider
import janca.dsl.html.attribute.ObjectAttributeProvider
import janca.dsl.html.attribute.VSpaceAttributeProvider
import janca.dsl.html.attribute.WidthAttributeProvider
import janca.dsl.html.element.IElement
import janca.dsl.html.element.init

@Deprecated("Use 'object'")
open class AppletElement :
    EmbeddedElement("applet", false),
    AlignAttributeProvider,
    AltAttributeProvider,
    ArchiveAttributeProvider,
    CodeAttributeProvider,
    DataFldAttributeProvider,
    DataSrcAttributeProvider,
    HeightAttributeProvider,
    HSpaceAttributeProvider,
    MayScriptAttributeProvider,
    NameAttributeProvider,
    ObjectAttributeProvider,
    VSpaceAttributeProvider,
    WidthAttributeProvider

interface AppletElementProvider : IElement {
    @Deprecated(
        "Use 'object'",
        ReplaceWith(
            "addChild(ObjectElement().init(className = className, id = id, text = text, init = init))",
            "janca.dsl.html.element.impl.embed.ObjectElement",
            "janca.dsl.html.element.init"
        )
    )
    fun applet(
        className: String? = null,
        id: String? = null,
        text: String? = null,
        init: (AppletElement.() -> Unit)? = null
    ) = addChild(AppletElement().init(className = className, id = id, text = text, init = init))
}