import jdk.incubator.vector.Float16.divide
import jdk.incubator.vector.Float16.multiply

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println(add(num1, num2))
    println(subtract(num1, num2))
    println(multiply(num1, num2))
    println(divide(num1, num2))
}
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2

    }
fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2

}
fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2
}


fun divide(num1: Int, num2: Int): Int {
    return num1 / num2
}


