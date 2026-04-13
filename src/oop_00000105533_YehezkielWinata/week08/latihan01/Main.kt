fun main(){
    println("=== TEST SAFE CALLS & ELVIS ==="
    val emptyOrder = Order(null, null))

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak di ketahui"
    println("Tujuan pengiriman: $destination")
}