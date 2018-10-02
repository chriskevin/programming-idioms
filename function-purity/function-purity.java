import java.util.ArrayList;
import java.util.List;

public class FunctionPurity {

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
    public static List<String> impureAddWhen(Predicate pred, String value, List<String> list) {
        if (list.stream().anyMatch(pred)) {
            list.add(value);
        }
        return list;
    }

    /**
     * 
     */
    public static List<String> pureAddWhen(Predicate pred, String value, List<String> list) {
        return list.stream().anyMatch(pred) ?
            Stream.concat(list.stream(), Stream.of(value))
                .collect(Collectors.toList()) :
            list;
    }

    /**
     * We use Vavr now to avoid the mess that Java 8+ forces on us.
     * io.vavr.Function3 and io.vavr.collection.List are used.
     *
     * public static final Function3<Predicate, String, List<String>, List<String>> pureAddWhen =
     *     (pred, value, list) -> list.exists(pred) ? list.append(value) : list;
     */

    public static void main(String[] args) {
        System.out.println(""); // ""
    }
}