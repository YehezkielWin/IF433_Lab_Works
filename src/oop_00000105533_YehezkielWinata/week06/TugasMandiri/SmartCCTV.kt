class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Smart Lamp menyala dengan kecerahan sedang.")
        startRecord()
    }

    override fun turnOff() {
        println("Smart Lamp dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("$name mulai merekam...")
    }
}