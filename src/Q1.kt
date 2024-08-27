class Pessoa(nome : String, idade: Int) {
    var nome = nome
    var idade = idade
    fun getPessoa(){
        println("Nome: ${nome}, Idade: ${idade}")
    }
}

fun main() {
    var Pessoa1 = Pessoa("Lucas", 28)
    Pessoa1.getPessoa()
}