fun main() {
    val a1 = Array(100) { 0 }

    val a2 = Array(100) { i ->
        i * 2
    }

    a2.shuffle()
    println(a2.joinToString(", "))
    a2.sort()


    println(a2.joinToString(", "))

}