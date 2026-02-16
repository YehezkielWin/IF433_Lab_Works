package oop_00000105533_YehezkielWinata.week03.tugas1

class Weapon (var Name: String, Damage: Int, Tier: String){

    var Damage: Int = Damage
        set(Value){
            if (Value < 0){
                println("Damage Tidak boleh negatif!")
                field = 0
            } else if (Value > 1000){
                println("Damage Overpowered")
                field = 1000
            } else {
                field = Value
            }
        }

    var Tier: String = Tier
        get(){
            if (Damage > 800){
                return "Legendary"
            } else if (Damage > 500) {
                return "Epic"
            } else {
                return "Common"
            }
        }

}