class SmartHomeHub(val devices = mutableListOf<SmartDevice>()){
    fun addDevice(device: SmartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for (device in devices){
            if (device is switchable){
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode(){
        for (device in devices){
            if (device is Recordable){
                device.startRecord()
            }else if (devise is SmartSpeaker){
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}