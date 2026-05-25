package oop_001_johnthor.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}