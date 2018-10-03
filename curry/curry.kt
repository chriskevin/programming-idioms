fun add(x: Int, y: Int): Int {
    return x + y
}

fun curriedAdd(x: Int) = {y: Int -> x + y}

/**
 * This is the same thing but in a longer form.
 *
 * fun curriedAdd(x:Int) : (Int) -> Int {
 *     return {y:Int -> x + y}
 * }
 */


fun main(args: Array<String>) {
    println("Non curried: " + add(1, 2)) // "Non curried: 3"
    println("Curried: " + curriedAdd(1)(2)) // "Curried: 3"
}