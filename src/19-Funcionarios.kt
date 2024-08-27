data class Funcionario(val id: Int, var nome: String, var cargo: String, var salario: Double)

class SistemaGestaoFuncionarios {
    private val funcionarios = mutableListOf<Funcionario>()
    private var proximoId = 1

    fun adicionarFuncionario(nome: String, cargo: String, salario: Double) {
        val funcionario = Funcionario(proximoId++, nome, cargo, salario)
        funcionarios.add(funcionario)
        println("Funcionário ${funcionario.nome} adicionado com sucesso!")
    }

    fun removerFuncionario(id: Int) {
        val funcionario = funcionarios.find { it.id == id }
        if (funcionario != null) {
            funcionarios.remove(funcionario)
            println("Funcionário ${funcionario.nome} removido com sucesso!")
        } else {
            println("Funcionário com ID $id não encontrado.")
        }
    }

    fun atualizarFuncionario(id: Int, nome: String? = null, cargo: String? = null, salario: Double? = null) {
        val funcionario = funcionarios.find { it.id == id }
        if (funcionario != null) {
            nome?.let { funcionario.nome = it }
            cargo?.let { funcionario.cargo = it }
            salario?.let { funcionario.salario = it }
            println("Funcionário ${funcionario.nome} atualizado com sucesso!")
        } else {
            println("Funcionário com ID $id não encontrado.")
        }
    }

    fun listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            println("Nenhum funcionário cadastrado.")
        } else {
            funcionarios.forEach {
                println("ID: ${it.id}, Nome: ${it.nome}, Cargo: ${it.cargo}, Salário: ${it.salario}")
            }
        }
    }
}

fun main() {
    val sistema = SistemaGestaoFuncionarios()

    sistema.adicionarFuncionario("Ana", "Gerente", 5000.0)
    sistema.adicionarFuncionario("Carlos", "Desenvolvedor", 4000.0)

    sistema.listarFuncionarios()

    sistema.atualizarFuncionario(1, salario = 5500.0)

    sistema.removerFuncionario(2)

    sistema.listarFuncionarios()
}
