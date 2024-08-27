import kotlin.math.sqrt

class MatematicaUtil {
    companion object {
        fun quadrado(numero: Double): Double {
            return numero * numero
        }
        fun cubo(numero: Double): Double {
            return numero * numero * numero
        }
        fun raizQuadrada(numero: Double): Double {
            return sqrt(numero)
        }

    }

}

fun main() {
    var numero = 25.0
    println(MatematicaUtil.quadrado(numero))
    println(MatematicaUtil.cubo(numero))
    println(MatematicaUtil.raizQuadrada(numero))
}