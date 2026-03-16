fun main(){
    GameManager.startGame()
    GameManager.startGame() 

    println("Drop Chance Legendary : ${itemRarity.LEGENDARY.dropChance}%")

    val starterSword = Weapon.forgeStarterSword()
    println("Senjata awal pemain:")
    println("Nama: ${starterSword.name}")
    println("Damage: ${starterSword.damage}")
    println("Rarity: ${starterSword.rarity}")
}