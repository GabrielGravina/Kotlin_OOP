class ContaBancaria(private var name: String){
    var saldo: Double = 0.0
        private set

    fun sacar(valor: Double){
        if(valor > 0 && valor<=saldo){
            saldo-=valor
        }
    }

    fun depositar(valor: Double){
        if(valor>0){
            saldo+=valor
        }
    }
}

fun main(){
    var c1 = ContaBancaria("Gabriel")
    c1.depositar(1000.0)
    c1.sacar(200.0)

    "O kotlin já tem um getter automático, que estou utilizando abaixo em c1.saldo"
    println("Saldo: ${c1.saldo}")

}