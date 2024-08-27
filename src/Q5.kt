open class Vehicle(var marca: String, var modelo: String) {
    fun move(){
        println("The vehicle is moving.")
    }

    fun getInfo(){
        println("Marca: ${marca}, Modelo: ${modelo}")
    }
}

class Car(marca:String, modelo: String) : Vehicle(marca, modelo) {

    var numPortas: Int = 4
    var numRodas: Int = 4

    fun refuel(){
        println("The vehicle is refueling...")
    }

}

fun main () {
    var car1 = Car("Toyota", "Prius")
    car1.getInfo()
    car1.refuel()
}