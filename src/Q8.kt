class Aluno(val nome: String, val matricula: String, var nota: Double)
class Escola(val nome: String) {

    //Precisei de ajuda para essa parte
    private val alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno) {
        alunos.add(aluno)
        println("Aluno ${aluno.nome} adicionado à escola $nome.")
    }

    fun listarAlunos() {
        println("Alunos da escola $nome:")
        for (aluno in alunos) {
            println("Nome: ${aluno.nome}, Matrícula: ${aluno.matricula}, Nota: ${aluno.nota}")
        }
    }
}

fun main() {
    val escola = Escola("Escola ABC")

    val aluno1 = Aluno("João", "123", 8.5)
    val aluno2 = Aluno("Maria", "456", 9.0)
    val aluno3 = Aluno("Pedro", "789", 7.5)

    escola.adicionarAluno(aluno1)
    escola.adicionarAluno(aluno2)
    escola.adicionarAluno(aluno3)

    escola.listarAlunos()
}