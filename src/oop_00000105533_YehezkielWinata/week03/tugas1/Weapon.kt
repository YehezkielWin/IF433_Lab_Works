package oop_00000105533_YehezkielWinata.week03.tugas1

class Weapon(var Name: String, damage: Int, tier: String){

    var Damage: Int =
        if (damage < 0) {
            println("Damage Tidak boleh negatif!")
            0
        } else if (damage > 1000) {
            println("Damage Overpowered")
            1000
        } else {
            damage
        }
        set(value){
            if (value < 0){
                println("Damage Tidak boleh negatif!")
                field = 0
            } else if (value > 1000){
                println("Damage Overpowered")
                field = 1000
            } else {
                field = value
            }
        }

    val Tier: String
        get(){
            return if (Damage > 800){
                "Legendary"
            } else if (Damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }
}
