fun multiply(x: Int, y: Int): Int {
    return x * y
}

// A curried function that can be partially applied is necessary for pointfree style.
fun curriedMultiply(x: Int) = {y: Int -> x * y}

fun main(args: Array<String>) {
    // With pointful style it is necessary to explicitly specify the argument.
    println(listOf(1, 2, 3, 4, 5).map({x: Int -> multiply(2, x)})) // [2, 4, 6, 8, 10]

    // With pointfree style the argument is implicitly applied.
    println(listOf(1, 2, 3, 4, 5).map(curriedMultiply(2))) // [2, 4, 6, 8, 10]
}