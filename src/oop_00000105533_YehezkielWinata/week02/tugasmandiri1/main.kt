package oop_00000105533_YehezkielWinata.week02.tugasmandiri1
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)

    print("Input Judul: ")
    var judul = scanner.nextLine()
    print("Enter Nama Peminjam: ")
    var namaPem = scanner.nextLine()
    print("Lama Pinjam: ")
    var lamaPinjam = scanner.nextInt()

    if (lamaPinjam < 0){
        var lamaPinjam = 1
    }

    val loan1 = Loan(judul, namaPem, lamaPinjam)
    println("Detail Peminjaman: ")
    println("Judul : ${loan1.BookTitle}")
    println("Peminjam: ${loan1.Borrower}")
    println("Lama Peminjaman: ${loan1.loanDuration}")
    println("Total denda:Rp ${loan1.calculateFine()}")
}