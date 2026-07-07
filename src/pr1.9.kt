fun main() {
    val arr = arrayOf(10, 50, 20, 14, 40)

    var max = arr[0]

    for (i in 1..4) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    println(max)
}