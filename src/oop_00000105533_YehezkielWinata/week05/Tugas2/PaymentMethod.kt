package oop_00000105533_YehezkielWinata.week05.Tugas2

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}