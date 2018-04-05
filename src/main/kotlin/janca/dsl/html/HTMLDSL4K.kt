package janca.dsl.html

import janca.dsl.html.element.IElement
import janca.dsl.html.element.TextElement
import janca.dsl.html.element.impl.struct.BreakElement

fun <T : IElement> HTMLString(element: T): String {
    when (element) {
        is TextElement -> return element.text
        is BreakElement -> return "<${element.tagName} />"
        else -> {

            val html = StringBuilder()
            if (element.tagName.isNotBlank()) {
                html.append("<${element.tagName}")
            }

            if (element.hasAttributes()) {
                val attributes = element.getAttributes()
                attributes.forEach { token, value ->
                    html.append(" $token")
                    if (value !is String || value.isNotBlank()) {
                        html.append("=\"$value\"")
                    }
                }
            }

            if (element.tagName.isNotBlank()) {
                html.append(">")
            }

            if (element.hasChildren()) {
                val children = element.getChildren()
                for (child in children) {
                    html.append(HTMLString(child))
                }
            }

            if (!element.isAutoClosing && element.tagName.isNotBlank()) {
                html.append("</${element.tagName}>")
            }

            return html.toString()
        }
    }
}