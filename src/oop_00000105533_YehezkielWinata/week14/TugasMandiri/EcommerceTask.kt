package oop_001_johnthor.week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName, $finalPrice, $customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use { writer ->
            writer.append("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

class FinalSafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy, customerType: String) {
        val finalPrice = strategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")
        
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}