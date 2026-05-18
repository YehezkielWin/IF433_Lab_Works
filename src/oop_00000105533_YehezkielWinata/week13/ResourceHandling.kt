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

}