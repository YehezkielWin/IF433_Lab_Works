package oop_00000105533_YehezkielWinata.week03.tugas2

fun main(){
    var player = Player("Yehezkiel")
    //player.xp = 30 error karena private
    player.addXp(50)
    println ("Masih Level ${player.level}")

    player.addXp(60)
    println("Level anda ${player.level}")


}