enum class DiasDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

class Agenda {
    private val compromissos: MutableMap<DiasDaSemana, MutableList<String>> = mutableMapOf()

    fun adicionarCompromisso(dia: DiasDaSemana, compromisso: String) {
        if (compromissos[dia] == null) {
            compromissos[dia] = mutableListOf(compromisso)
        } else {
            compromissos[dia]?.add(compromisso)
        }
    }

    fun obterCompromissos(dia: DiasDaSemana): List<String>? {
        return compromissos[dia]
    }

    fun exibirTodosCompromissos() {
        for ((dia, compromissos) in compromissos) {
            println("$dia: $compromissos")
        }
    }
}

fun main() {
    val minhaAgenda = Agenda()

    minhaAgenda.adicionarCompromisso(DiasDaSemana.SEGUNDA, "Reunião de equipe")
    minhaAgenda.adicionarCompromisso(DiasDaSemana.SEXTA, "Revisão de projeto")
    minhaAgenda.adicionarCompromisso(DiasDaSemana.SEXTA, "Apresentação do relatório")

    println("Compromissos de sexta-feira: ${minhaAgenda.obterCompromissos(DiasDaSemana.SEXTA)}")


    println("\nTodos os compromissos:")
    minhaAgenda.exibirTodosCompromissos()
}

 