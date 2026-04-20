fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -3.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 8.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, -6.7, "OPEN"),
        TradeLog("BNBUSDT", "LONG", 8, 4.3, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 12, -1.5, "OPEN")
    )

    println("=== Pipeline 1 ===")
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("Closed Trades:")
    closedTrades.forEach { println(it) }

    println("\n=== Pipeline 2 ===") 
    val winningTrades = closedTrades.filter{ it.roe > 0} 
    println("Winning Trades:") 
    winningTrades.forEach { println(it) }

    println("\n=== Pipeline 3 ===")
    val losingTrades = closedTrades.filter{ it.roe <= 0}
    println("Losing Trades:")
    losingTrades.forEach { println(it) }

    println("\n=== Pipeline 4 ===")
    val topPerformersString = winningTrades.sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("Top Performers:")
    topPerformersString.forEach { println(it) }

    println("\n=== Pipeline 5 ===")
    val worstPerformersString = losingTrades.sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("Worst Performers:")
    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    worstPerformersString.forEach { println(it) }
    println("\nUnique Trading Pairs: ${uniquePairs.joinToString(", ")}")
}