package oop_00000105533_YehezkielWinata.week04.Tugas2

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}