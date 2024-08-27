class Engine() {
    var isOn: Boolean = false

    fun turnOn(){
        if(!isOn){
            isOn = true
            println("O motor foi ligado.")
        }else{
            println("O motor JÁ ESTÁ ligado.")
        }
    }

    fun turnOff() {
        if (isOn) {
            isOn = false
            println("O motor foi desligado.")
        }else {
            println("O motor JÁ ESTÁ desligado.")
        }
    }
}

class CarQ7() {
    val engine = Engine()

    fun turnCarOn(){
        println("Ligando o carro...")
        engine.turnOn()
    }

    fun turnCarOff(){
        println("Desligando o carro...")
        engine.turnOff()
    }
}

fun main(){
    var car1 = CarQ7()
    car1.turnCarOn()
    car1.turnCarOff()
}