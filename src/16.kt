class Caixa<T> {
    private val itens: MutableList<T> = mutableListOf()

    fun adicionarItem(item: T) {
        itens.add(item)
    }

    fun removerItem(item: T): Boolean {
        return itens.remove(item)
    }

    fun listarItens() {
        if (itens.isEmpty()) {
            println("A caixa está vazia.")
        } else {
            itens.forEach { println(it) }
        }
    }
}

fun main() {
    val caixaInt = Caixa<Int>()
    caixaInt.adicionarItem(10)
    caixaInt.adicionarItem(20)
    caixaInt.listarItens()

    val caixaString = Caixa<String>()
    caixaString.adicionarItem("Livro")
    caixaString.adicionarItem("Caneta")
    caixaString.listarItens()

    caixaString.removerItem("Caneta")
    caixaString.listarItens()
}
