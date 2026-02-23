package oop_00000105533_YehezkielWinata.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val mobillistrik = ElectricCar("Tesla",4,50)
    mobillistrik.accelerate()
    mobillistrik.honk()
    mobillistrik.openTrunk()

}