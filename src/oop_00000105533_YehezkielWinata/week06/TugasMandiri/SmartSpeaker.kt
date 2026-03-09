class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

     override fun turnOn() {
        println("Smart Lamp menyala dengan kecerahan sedang.")
    }

    override fun turnOff() {
        println("Smart Lamp dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari spotify")
    }
}