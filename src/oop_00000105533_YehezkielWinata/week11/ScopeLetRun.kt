package oop_00000105533_yehezkielwinata.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}