package oop_00000105533_YehezkielWinata.week01

fun main (){
    val gameTitle:String = "Avengers End Game"
    val price: Int = 90000000
    println(calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int = if (price > 50000000) price/10 else 0