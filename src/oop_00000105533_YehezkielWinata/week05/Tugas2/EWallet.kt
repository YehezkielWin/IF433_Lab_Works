package oop_00000105533_YehezkielWinata.week05.Tugas2

class EWallet(var balance: Double): PaymentMethod("Yehezkiel") {
    override fun processPayment(amount: Double) {
        if (amount >= balance) {
            balance -= amount
            println("Sukses!")
        }else {
            println("Saldo Tidak Cukup")
        }
    }

    fun topUp(amount: Double) {}
}