package oop_00000105533_YehezkielWinata.week03.tugas2

class Player (var username: String){
    private var xp: Int = 0
    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0 ){
            println("Hanya menerima angka Positif!!")
            xp = xp + 0
        }else {
            val oldLevel = level
            xp = xp + amount
            val newLevel = level

            if (newLevel > oldLevel){
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
    }
}