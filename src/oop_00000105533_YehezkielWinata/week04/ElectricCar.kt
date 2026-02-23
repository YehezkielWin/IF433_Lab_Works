package oop_00000105533_YehezkielWinata.week04

open class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}