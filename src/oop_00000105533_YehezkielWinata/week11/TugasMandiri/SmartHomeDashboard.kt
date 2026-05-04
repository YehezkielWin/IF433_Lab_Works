fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}