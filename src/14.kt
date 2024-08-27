class Livro(val titulo: String, val autor: String)

class Biblioteca {
    private val livros: MutableList<Livro> = mutableListOf()

    fun adicionarLivro(livro: Livro) {
        livros.add(livro)
    }

    fun removerLivro(titulo: String) {
        livros.removeIf { it.titulo == titulo }
    }

    fun listarLivros() {
        if (livros.isEmpty()) {
            println("A biblioteca está vazia.")
        } else {
            livros.forEach { println("Título: ${it.titulo}, Autor: ${it.autor}") }
        }
    }
}

fun main() {
    val biblioteca = Biblioteca()
    biblioteca.adicionarLivro(Livro("1984", "George Orwell"))
    biblioteca.adicionarLivro(Livro("Dom Quixote", "Miguel de Cervantes"))
    biblioteca.listarLivros()
    biblioteca.removerLivro("1984")
    biblioteca.listarLivros()
}
