/**
 * A higher order function is a function that takes a function as an argument.
 * Higher order functions can also return a function depending on it's use case.
 * This replaces the Strategy pattern from the OOP Design Patterns.
 * Higher order functions allow us to write more generic code and inject the specific details.
 */
fun <T: Any, U: Any> map(fn: (T) -> U, list: List<T>): List<U> {
    val newList: MutableList<U> = mutableListOf()
    
    for (item in list) {
        newList.add(fn(item))
    }

    return newList.toList()
}

fun main(args: Array<String>) {
    println(map<Int, Int>({x -> x + 5}, listOf(1, 2, 3, 4, 5))) // [6, 7, 8, 9, 10]
}