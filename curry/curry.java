import java.util.function.Function;

public class Main {

    public static Integer add(final Integer x, final Integer y) {
        return x + y;
    }

    public static final Function<Integer, Function<Integer, Integer>> curriedAdd =
        x -> y -> x + y;

    /**
     * With Vavr you can use addtional functional interfaces to handle functions with multiple arguments.
     * This becomes a lot cleaner than nesting Function<T, Function<U, R>>, which only becomes worse the more arguments you have!
     *
     * public static final Function2<Integer, Integer, Integer> curriedAdd =
     *   (x, y) -> x + y;
     */

    public static void main(final String[] args) {
        System.out.println("Non curried: " + add(1, 2)); // "Non curried: 3"
        System.out.println("Curried: " + curriedAdd.apply(1).apply(2)); // "Curried: 3"

        /**
         * Vavrs Function objects come with additional capabilities.
         * If you want to you could apply all arguments directly or partially.
         *
         * System.out.println("Curried: " + curriedAdd.apply(1, 2)); // "Curried: 3"
         * System.out.println("Curried: " + curriedAdd.apply(1).apply(2)); // "Curried: 3"
         */
    }
}