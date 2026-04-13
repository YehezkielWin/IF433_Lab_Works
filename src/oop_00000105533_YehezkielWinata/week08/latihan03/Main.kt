fun main(){
    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf("Smartphone", 
    1500000, 
    UserProfile("Andi", null),
    "Laptop", 
    4500000.0
    )

    for (item in mixedData){
        val text = item as? String

        text?.let{
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
}