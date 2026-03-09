class SmartLamp : SmartDevice, Switchable {
    override fun TurnOn() {
        println("Smart Lamp menyala dengan kecerahan sedang.")
    }

    override fun TurnOff() {
        println("Smart Lamp dimatikan.")
    }   
}