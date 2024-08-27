open class Animal(){
    open fun emitirSom(){
        println("...")
    }
}

class Cachorro() : Animal(){
    override fun emitirSom(){
        println("Au au")
    }
}

class Gato() : Animal(){
    override fun emitirSom(){
        println("Miau")
    }
}

fun main() {
    var animal = Animal()
    var cachorro = Cachorro()
    var gato = Gato()

    animal.emitirSom()
    cachorro.emitirSom()
    gato.emitirSom()


}