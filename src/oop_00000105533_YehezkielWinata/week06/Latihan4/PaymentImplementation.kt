class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
    }
}