package janca.dsl.html.element

import janca.dsl.extension.synchronized
import janca.dsl.html.attribute.GlobalAttributeProvider
import janca.dsl.html.provider.SimpleTextProvider
import java.util.*

open class Element(override val tagName: String, override val isAutoClosing: Boolean = false) : IElement, GlobalAttributeProvider, SimpleTextProvider {
    private val children: LinkedList<IElement> by lazy { LinkedList<IElement>() }
    private val _attributes: MutableMap<String, Any> by lazy { TreeMap<String, Any>(String.CASE_INSENSITIVE_ORDER) }

    fun setStyle(style: String?) {
        this.setAttribute("style", style)
    }

    fun setStyle(style: Map<String, String>) {
        val styleBuilder = StringBuilder()
        style.toSortedMap(Comparator.naturalOrder())
        style.forEach { property, value ->
            styleBuilder.append("$property: $value;")
        }

        styleBuilder.setLength(styleBuilder.length - 1)
        setStyle(styleBuilder.toString())
    }

    override fun addChild(element: IElement) = children.synchronized { add(element) }

    override fun hasChildren(): Boolean = children.isNotEmpty()

    override fun getChildren(): List<IElement> = Collections.unmodifiableList(children)

    override fun <T> getAttribute(token: String): T? {
        _attributes.synchronized {
            @Suppress("UNCHECKED_CAST")
            return _attributes["token"] as T
        }

        return null
    }

    override fun setAttribute(token: String, value: Any?) {
        _attributes.synchronized {
            if (value == null && _attributes.containsKey(token)) {
                _attributes.remove(token)
            } else if (value != null) {
                _attributes[token] = value
            }
        }
    }

    override fun getAttributes(): Map<String, Any> = Collections.unmodifiableMap(_attributes)

    override fun hasAttributes(): Boolean = _attributes.isNotEmpty()

    operator fun plus(element: IElement) = addChild(element)
    operator fun <T> get(token: String): T? = getAttribute(token)
    operator fun set(token: String, value: Any?) = setAttribute(token, value)
}

fun <T : Element> T.init(text: String? = null, className: String? = null, id: String? = null, init: (T.() -> Unit)? = null): T {
    text?.let {
        this.text(text)
    }

    className?.let {
        this.className = className
    }

    id?.let {
        this.id = id
    }

    init?.let {
        init.invoke(this)
    }

    return this
}