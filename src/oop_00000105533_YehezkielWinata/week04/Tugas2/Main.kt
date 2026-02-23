package oop_00000105533_YehezkielWinata.week04.Tugas2

fun main(){
    val Manajer = Manager("Yanto", 3000000)
    val Dev = Developer("Suranto", 1500000, "Python")

    Manajer.work()
    println("${Manajer.calculateBonus()}")

    Dev.work()
    println("${Dev.calculateBonus()}")
}