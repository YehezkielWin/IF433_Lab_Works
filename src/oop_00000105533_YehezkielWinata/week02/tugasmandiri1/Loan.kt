package oop_00000105533_YehezkielWinata.week02.tugasmandiri1

class Loan(
    val BookTitle: String,
    val Borrower: String,
    var loanDuration: Int = 1)
{
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

