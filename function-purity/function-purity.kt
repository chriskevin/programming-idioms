/**
    * The impure version has several problems.
    * 1) The function mutates the list. Why is this bad you might ask?
    * What if the intent was to do two different transformations using the original list?
    * One of the functions is likely to operate on an inconsistent state.
    * 2) Running this function concurrently is a hazard since several threads could mutate the same list at the same time.
    * Not to mention the possibility of deadlocks or race conditions.
    * 3) Writing a unit test for an impure function, is not reliable.
    * The test will lie to you when it passes, since the function is called in a controlled isolated environment.
    * However when paired together with other functionality there is a undesired risk that application will start behaving
    * unexpectedly. In other words, your are just lucky if something does not break!
    */
fun impureAddWhen(pred: (String) -> Boolean, value: String, list:MutableList<String>): MutableList<String> {
    if (list.any(pred))
        list.add(value)
    return list
}

/**
 * 
 */
fun pureAddWhen(pred: (String) -> Boolean, value: String, list:List<String>): List<String> {
    return if (list.any(pred)) list.union(listOf(value)).toList() else list
}

fun main(args: Array<String>) {
    println(impureAddWhen({s -> !s.equals("Smurf")}, "Smurf", mutableListOf("Orc", "Dragon"))) // [Orc, Dragon, Smurf]
    println(pureAddWhen({s -> !s.equals("Smurf")}, "Smurf", listOf("Orc", "Dragon"))) // [Orc, Dragon, Smurf]
}