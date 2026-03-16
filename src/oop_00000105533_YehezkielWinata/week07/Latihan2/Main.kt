println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) //akan mencetak memory hash
    println("Sama? ${reg1 == reg2}") //false karena membandingkan referensi objek, bukan isi data

println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Bob", 30)
    val data2 = DataUser("Bob", 30)
    println(data1) //akan mencetak isi data dengan format yang rapi
    println("Sama? ${data1 == data2}") //true karena membandingkan isi data, bukan referensi objek

val data3 = data1.copy(age = 23) 
    println("Hasil Copy: $data3") 

val (userName, userAge) = data1 
    println("Destructured: Name = $userName, Age = $userAge")