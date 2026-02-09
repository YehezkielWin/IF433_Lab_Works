package oop_00000105533_YehezkielWinata.week02.tugasmandiri2

class Hero (var Name: String, var hp: Int = 100, var baseDamage: Int){
    fun attack(targetName: String){
        println("$Name menebas $targetName!")
    }

    fun takeDamage(damage: Int): Int{
        return if (hp <= 0){
             0
        } else {
            hp - damage
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}