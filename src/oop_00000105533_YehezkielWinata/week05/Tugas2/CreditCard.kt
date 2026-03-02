package oop_00000105533_YehezkielWinata.week05.Tugas2

class CreditCard(val limit: Double, var usedAmount: Double = 0.0): PaymentMethod("Yehezkiel") {
    override fun processPayment(amount: Double) {
        if(usedAmount + amount < limit){
            usedAmount++
            println("Sukses!")
        }else{
            println("Transaksi Ditolak")
        }
    }
}