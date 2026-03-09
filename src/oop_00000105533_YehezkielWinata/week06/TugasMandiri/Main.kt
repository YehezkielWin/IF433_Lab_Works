fun main(){
    val hub = SmartHomeHub()
    val lampu = SmartLamp("0101","Ruang Tamu")
    val spiker = SmartSpeaker("0202","Google Nest Dapur")
    val sisitipi = SmartCCTV("0303","Ezviz Garasi")

    hub.addDevice(lampu)
    hub.addDevice(spiker)
    hub.addDevice(sisitipi)

    println("Aktivasi mode keamanan...")
    hub.activateSecurityMode()

    println("\nMematikan semua perangkat yang bisa di-switch off...")
    hub.turnOffAllSwitches().
}