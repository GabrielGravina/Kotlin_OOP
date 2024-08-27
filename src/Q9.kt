interface Movimentavel {
    fun moverParaCima ()
    fun moverParaDireita ()
}

interface Desenhavel{
    fun desenhar()
}

class Personagem(var nome: String, var posX: Int = 0, var posY: Int = 0): Movimentavel, Desenhavel {
    override fun moverParaCima(){
        posY+=10
        println("Moveu-se 10 pixels acima")
    }

    override fun moverParaDireita() {
        posX+=10
        println("Moveu-se 10 pixels à direita")
    }

    override fun desenhar() {
        println("Desenhando o personagem ${nome} na posição (${posX},${posY}).")
    }
}

fun main(){
    var personagem1 = Personagem("Antonio")
    personagem1.moverParaCima()
    personagem1.moverParaDireita()
    personagem1.moverParaDireita()

    personagem1.desenhar()
}