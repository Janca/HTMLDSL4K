package janca.dsl.html.attribute

import janca.dsl.html.element.IElement

interface GlobalAttributeProvider : IElement {
    var accessKey: String?
        get() = this.getAttribute("accesskey")
        set(value) = this.setAttribute("accesskey", value)

    var className: String?
        get() = this.getAttribute("class")
        set(value) = this.setAttribute("class", value)

    var contentEditable: Boolean?
        get() = this.getAttribute("contenteditable") ?: true
        set(value) = this.setAttribute("contenteditable", value)

    var contextMenu: String?
        get() = this.getAttribute("contextmenu")
        set(value) = this.setAttribute("contextmenu", value)

    var dir: String?
        get() = this.getAttribute("dir")
        set(value) = this.setAttribute("dir", value)

    var draggable: Boolean?
        get() = this.getAttribute("draggable")
        set(value) = this.setAttribute("draggable", value)

    var dropzone: String?
        get() = this.getAttribute("dropzone")
        set(value) = this.setAttribute("dropzone", value)

    var hidden: Boolean?
        get() = this.getAttribute("hidden")
        set(value) = this.setAttribute("hidden", value)

    var id: String?
        get() = this.getAttribute("id")
        set(value) = this.setAttribute("id", value)

    var lang: String?
        get() = this.getAttribute("lang")
        set(value) = this.setAttribute("lang", value)

    var spellCheck: Boolean?
        get() = this.getAttribute("spellcheck")
        set(value) = this.setAttribute("spellcheck", value)

    var style: Boolean?
        get() = this.getAttribute("style")
        set(value) = this.setAttribute("style", value)

    var tabIndex: Int?
        get() = this.getAttribute("tabindex")
        set(value) = this.setAttribute("tabindex", value)

    var title: String?
        get() = this.getAttribute("title")
        set(value) = this.setAttribute("title", value)

    var translate: Boolean?
        get() = this.getAttribute("translate")
        set(value) = this.setAttribute("translate", value)

    var xmlLang: Boolean?
        get() = this.getAttribute("xml:lang")
        set(value) = this.setAttribute("xml:lang", value)
}