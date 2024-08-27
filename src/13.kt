class DivisaoPorZeroException(message: String) : Exception(message)

class Divisao {
    fun dividir(a: Int, b: Int): Int {
        if (b == 0) {
            throw DivisaoPorZeroException("Erro: Divisão por zero não é permitida.")
        }
        return a / b
    }
}

fun main() {
    val divisao = Divisao()

    try {
        println(divisao.dividir(10, 2))
        println(divisao.dividir(10, 0))  // Lança a exceção
    } catch (e: DivisaoPorZeroException) {
        println(e.message)
    }
}
