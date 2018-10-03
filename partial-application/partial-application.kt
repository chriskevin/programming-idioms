/**
 * This is the usual way you would reuse code to create more specific functionality from general functionality.
 *
 * fun add(x: Int, y: Int): Int {
 *     return x + y
 * }
 *
 * fun inc(x: Int): Int {
 *     return add(x, 1)
 * }
 */

fun add(x: Int) = {y: Int -> x + y}

/* Currying let's us leverage partial application which eliminates all the extra noise. */
val inc = add(1)

fun main(args: Array<String>) {
    println("Applied second argument:" + inc(2)); // "Applied second argument: 3"
}