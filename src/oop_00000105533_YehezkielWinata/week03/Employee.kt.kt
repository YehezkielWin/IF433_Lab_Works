package oop_00000105533_YehezkielWinata.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value){
            if (value < 0){
                println("Gaji Tidak boleh Minus. di set ke 0!")
                field = 0
            }else {
                field = value
            }
        }
}