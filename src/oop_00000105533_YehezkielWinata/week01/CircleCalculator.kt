package oop_00000105533_YehezkielWinata.week01

fun main () {
    val radius = 7.0
    val pi = 3.14

    var area = radius * pi * radius

    println("Radius: $radius, pi: $pi")
    println(checkSize(area))
}

fun checkSize(area: Double) =
    if (area > 100) ("This is a Big Circle")
    else ("This is a Small Circle")
