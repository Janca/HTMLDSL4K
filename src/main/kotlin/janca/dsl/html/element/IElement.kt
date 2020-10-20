package janca.dsl.html.element

@DslMarker
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class ElementDsl

@ElementDsl
interface IElement {
    val tagName: String
    val isAutoClosing: Boolean
    fun addChild(element: IElement): IElement
    fun hasChildren(): Boolean
    fun getChildren(): List<IElement>
    fun <T> getAttribute(token: String): T?
    fun setAttribute(token: String, value: Any? = "")
    fun getAttributes(): Map<String, Any>
    fun hasAttributes(): Boolean
}