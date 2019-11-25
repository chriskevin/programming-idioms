/**
 * A recursive function solves one part of the problem and then calls itself until
 * it has exhaustively solved the entire problem.
 * 
 * A recursive function requires a base case on which it terminates. Otherwise the function will
 * create an infinite loop that consumes the entire call stack.
 */

fun <T: Any, U: Any> map(f: (T) -> U, xs: List<T>): List<U> {
    return if (xs.isEmpty()) emptyList()
    else listOf(f(xs.first())) + map(f, xs.subList(1, xs.size))
}