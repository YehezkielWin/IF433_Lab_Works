package oop_00000105533_YehezkielWinata.week02.tugasmandiri2
import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan stat Damage: ")
    val statDamage = scanner.nextInt()
    scanner.nextLine()
    print("Masukkan nama musuh: ")
    val enemyName = scanner.nextLine()
    var enemyHp = 100
    val hero1 = Hero(heroName, 100, statDamage)

    println("\nPertarungan dimulai antara ${hero1.Name} dan $enemyName!\n")

    while (hero1.isAlive() && enemyHp > 0) {
        print("Pilih Menu 1. Serang 2. Kabur: ")
        val input = scanner.nextInt()

        if (input == 1) {
            enemyHp -= hero1.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("${hero1.Name} menyerang $enemyName! HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21)
                hero1.takeDamage(enemyDamage)
                println("$enemyName menyerang balik! ${hero1.Name} HP: ${hero1.hp} (damage: $enemyDamage)\n")
            }
        } else {
            println("Kabur!!!")
            break
        }
    }

    if (hero1.isAlive() && enemyHp <= 0) {
        println("${hero1.Name} Menang!")
    } else if (!hero1.isAlive() && enemyHp > 0) {
        println("$enemyName Menang!")
    } else {
        println("Pertarungan Selesai!")
    }
}