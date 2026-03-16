fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            val monster = event.monsterName
            println("Monster muncul! Siap bertarung melawan: $monster")
        }

        is BattleState.LootDropped -> {
            val item = event.item
            println("Loot didapat: ${item.name} dengan rarity ${item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman, tidak ada pertarungan saat ini.")
        }
    }
}