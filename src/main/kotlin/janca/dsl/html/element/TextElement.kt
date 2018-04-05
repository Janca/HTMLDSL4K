package janca.dsl.html.element

open class TextElement(val text: String) : IElement {
    override val tagName: String = ""
    override val isAutoClosing: Boolean = false

    override fun addChild(element: IElement) = throw UnsupportedOperationException()
    override fun hasChildren(): Boolean = false
    override fun getChildren(): List<IElement> = throw UnsupportedOperationException()
    override fun <T> getAttribute(token: String): T? = throw UnsupportedOperationException()
    override fun setAttribute(token: String, value: Any?) = throw UnsupportedOperationException()
    override fun getAttributes(): Map<String, Any> = throw UnsupportedOperationException()
    override fun hasAttributes(): Boolean = false
}