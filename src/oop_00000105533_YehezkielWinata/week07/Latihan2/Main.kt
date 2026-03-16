println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) //akan mencetak memory hash
    println("Sama? ${reg1 == reg2}") //false karena membandingkan referensi objek, bukan isi data