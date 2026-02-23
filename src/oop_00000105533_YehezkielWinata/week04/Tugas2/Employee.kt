package oop_00000105533_YehezkielWinata.week04.Tugas2

open class Employee (val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int{
        return (baseSalary * 0.10).toInt()
    }
}