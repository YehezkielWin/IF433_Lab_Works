class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object{
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Pedang Epik khas Garut", 20, ItemRarity.EPIC), 150)
        }
    }
} 

    