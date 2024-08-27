class Calculadora{
    fun add(a: Number, b: Number): Double{
        return a.toDouble()+b.toDouble()
    }

    fun add(a: Number, b: Number, c:Number): Double{
        return a.toDouble()+b.toDouble()+c.toDouble()
    }

    fun sub(a: Number, b: Number): Double{
        return a.toDouble()-b.toDouble()
    }

    fun sub(a: Number, b: Number, c: Number): Double{
        return a.toDouble()-b.toDouble()-c.toDouble()
    }

    fun mult(a: Number, b: Number, c: Number): Double{
        return a.toDouble()*b.toDouble()*c.toDouble()
    }

    fun mult(a: Number, b: Number): Double{
        return a.toDouble()*b.toDouble()
    }

    fun div(a: Number, b: Number): Double{
        return a.toDouble()/b.toDouble()
    }

    fun div(a: Number, b: Number, c:Number): Double{
        return a.toDouble()/b.toDouble()/c.toDouble()
    }




}

fun main() {
    var calc = Calculadora()

    println(calc.add(5,4))
    println(calc.add(5,4,4))

    println(calc.sub(4,2))
    println(calc.sub(4,2,1))

    println(calc.mult(4,2))
    println(calc.mult(4,2,2))

    println(calc.div(8,2))
    println(calc.div(8,2,2))


}