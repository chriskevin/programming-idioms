fun multiply(x: Int, y: Int): Int {
    return x * y
}

/**
 * A curried function that can be partially applied is necessary for pointfree style.
 */
fun curriedMultiply(x: Int) = {y: Int -> x * y}

fun main(args: Array<String>) {
    /**
    * In a pointful scenario it is necessary to explicitly specify the parameter.
    */
    println(listOf(12, 24, 5).map({x: Int -> multiply(2, x)})) // [24, 48, 10]

    /**
    * In a pointfree scenario we do not care about the argument and let it be implicitly applied.
    */
    println(listOf(12, 24, 5).map(curriedMultiply(2))) // [24, 48, 10]
}