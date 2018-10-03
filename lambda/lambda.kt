/* Regular function */
fun regularFn(x: Int): Int {
    return x + x
}

/* Lambda */
val lambdaFn = {x: Int -> x + x}

fun main(args: Array<String>) {
    println(regularFn(2)) // 4
    println(lambdaFn(4)) // 8
}