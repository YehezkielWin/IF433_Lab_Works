package oop_00000105533_YehezkielWinata.week03

fun main(){
    val e = Employee("Budi")

    //1. test validasi salary
    e.salary = -1000 //harusnya print error
    e.salary = 1000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    //e.performancerating = 5

    //3. test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}