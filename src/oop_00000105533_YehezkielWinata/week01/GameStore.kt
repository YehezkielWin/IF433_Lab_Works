package oop_00000105533_YehezkielWinata.week01

fun main (){
    val gameTitle:String = "Avengers End Game"
    val price: Int = 90000000
    val Discount = calculateDiscount(price)
    val userNote: String? = null
    printReceipt(
        title = gameTitle,
        finalPrice = price - Discount,
        note = userNote
    )




}

fun calculateDiscount(price: Int): Int = if (price > 50000000) price/10 else 0

fun printReceipt(title: String, finalPrice: Int, note : String?){
    println ("===Struk Game Store ===")
    println ("Game Title: $title")
    println ("Harga Akhir : $finalPrice")
    println ("Note : ${note ?: "tidak ada pesan"}")
}