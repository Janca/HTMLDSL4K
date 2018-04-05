package janca.dsl.extension

inline fun <T> T.synchronized(synchronized: T.() -> Unit) {
    kotlin.synchronized(this as Any) {
        synchronized.invoke(this)
    }
}