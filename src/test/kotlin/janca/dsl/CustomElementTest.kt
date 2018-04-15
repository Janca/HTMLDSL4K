package janca.dsl

import janca.dsl.html.HTMLString
import janca.dsl.html.element.doctype
import janca.dsl.html.element.impl.meta.put
import janca.dsl.html.element.impl.struct.DivElement
import janca.dsl.html.provider.FlowContentElementProvider

fun FlowContentElementProvider.container(init: DivElement.() -> Unit) = addChild(DivElement().also { it.className = "container" }.also(init))
fun FlowContentElementProvider.column(widthPercent: Int, init: DivElement.() -> Unit) = addChild(DivElement().also { it.setStyle("width:$widthPercent%;padding:1.25rem 2rem;") }.also(init))

fun main(vararg args: String) {
    println(HTMLString(
            doctype {
                html {
                    head {
                        style {
                            addRule("*") {
                                put("box-sizing", "border-box")
                                put("margin", "0")
                                put("padding", "0")
                            }

                            addRule("body") {
                                put("margin", ".25rem")
                            }

                            addRule(".container") {
                                put("width", "100%")
                                put("display", "flex")
                                put("align-content", "space-evenly")

                                finer(">*") {
                                    put("text-align", "center")
                                }

                                finer(">div") {
                                    put("border", "1px solid orange")
                                    put("margin", "2px")
                                }
                            }
                        }
                    }

                    body {
                        container {
                            column(50) {
                                h2("Column 1")
                                p("This is some text inside column 1")
                            }

                            column(50) {
                                h2("Column 2")
                                p("This is some text inside column 2")
                            }
                        }

                        container {
                            column(25) {
                                h2("Column 1")
                            }

                            column(50) {
                                h2("Column 2")
                            }

                            column(25) {
                                h2("Column 3")
                            }
                        }
                    }
                }
            }
    ))
}