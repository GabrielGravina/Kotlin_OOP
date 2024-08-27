abstract class FormaGeometrica{
    abstract fun calcularArea(): Double
}

 class Quadrado(var lado: Double): FormaGeometrica() {
     override fun calcularArea(): Double {
         return lado*lado
     }
 }

class Circulo(var raio:Double): FormaGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

fun main() {
    var quadrado = Quadrado(5.0)
    var circulo = Circulo(3.0)

    println("A area do objeto é: ${quadrado.calcularArea()}")
    println("A area do objeto é: ${circulo.calcularArea()}")
}