import java.util.function.Function;

public class PartialApplication {

    /**
     * This is the usual way you would reuse code to create more specific functionality from general functionality.
     *
     * public static Integer add(Integer x, Integer y) {
     *     return x + y;
     * }
     *
     * public static Integer inc(Integer x) {
     *     return add(x, 1);
     * }
     */

    public static final Function<Integer, Function<Integer, Integer>> add =
        x -> y -> x + y;

    /* Currying let's us leverage partial application which eliminates all the extra noise. */
    public static final Function<Integer, Integer> inc = add.apply(1);
    public static void main(String[] args) {
        System.out.println("Applied second argument: " + inc.apply(2)); // "Applied second argument: 3"
    }
}