package oop_00000105533_YehezkielWinata.week05.Tugas2

fun Main(){
    val Dompet = EWallet(50000.0)
    val kartu = CreditCard(100000.0)

    val Metode: List<PaymentMethod> = listOf(
        Dompet, kartu
    )

    for(Metod in Metode){
        Metod.processPayment(75000.0)
    }

}