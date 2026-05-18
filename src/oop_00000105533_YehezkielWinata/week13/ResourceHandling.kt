package oop_001_johnthor.week13 // Sesuaikan package Anda

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    
    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()
    
    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
    
    // BAHAYA: Jika ada exception/error di atas baris ini, 
    // writer.close() di bawah tidak akan pernah tereksekusi!
    writer.close() 
    println("Proses penulisan unsafe selesai.")

    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")
    
    // Writer akan OTOMATIS di-close saat keluar dari blok kurawal use
    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

    println("\n=== TEST BUFFERED READER ===")
    // Membaca stream tanpa me-load seluruh file ke RAM sekaligus
    safeFile.bufferedReader().use { reader ->
        // Menggunakan sequence untuk mengambil 5 baris pertama saja secara malas (lazy evaluation)
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    } // File otomatis di-close di sini!
} 