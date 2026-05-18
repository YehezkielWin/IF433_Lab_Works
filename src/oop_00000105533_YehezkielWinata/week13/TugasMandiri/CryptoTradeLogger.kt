import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File trade tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 150.0, pnl = 45.5),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 100.0, pnl = -12.3),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 50.0, pnl = 15.2)
    )
    
    val filePath = "crypto_trades.csv"
    saveTrades(mockTrades, filePath)

    File(filePath).appendText("CORRUPT_ID, DOGEUSDT, Hold, XX ,YY\n")

    val loadedData = loadTrades(filePath)
    
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== DAFTAR TRANSAKSI VALID ===")
    loadedData.forEach { println(it) }
    
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
} 