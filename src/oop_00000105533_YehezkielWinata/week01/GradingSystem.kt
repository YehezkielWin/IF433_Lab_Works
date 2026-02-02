package oop_00000105533_YehezkielWinata.week01
fun main () {
    var name: String = "Yehezkiel Winata"
    var Grade: Int = 90

    println("Nama : $name, Nilai : $Grade")

    val nilai = when (Grade){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Nilai kamu: $nilai")
}
