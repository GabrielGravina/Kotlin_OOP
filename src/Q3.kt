class Produto(var name: String, var price: Double, var quantity: Int){
    fun getInfo(): String{
        return "Name: ${name}, Price: ${price}, Quantity: ${quantity}"
    }
}

fun main(){
    var produto1 = Produto("Smartphone", 1000.0, 50)
    var produto2 = Produto("Chocolate", 10.0, 500)
    var produto3 = Produto("Computador", 3000.0, 10)

    println(produto1.getInfo())
    println(produto2.getInfo())
    println(produto3.getInfo())

}