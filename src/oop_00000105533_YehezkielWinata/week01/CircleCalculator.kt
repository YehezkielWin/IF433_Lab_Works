package oop_00000105533_YehezkielWinata.week01

fun main (){
    var radius: Double = 7.0
    var pi: Double = 3.14

    var area: Double = radius * pi * radius

    println("Radius:" + radius + ", pi:" + pi)
    checkSize(area)
}

fun checkSize(area: Double){
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println ("This is a Small Circle")
    }
}