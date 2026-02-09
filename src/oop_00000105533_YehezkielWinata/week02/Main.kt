package oop_00000105533_YehezkielWinata.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Nim (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    scanner.nextLine()

    if (nim.length != 5){
        println("Error: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    }else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}