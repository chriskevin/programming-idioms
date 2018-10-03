public class FunctionCompose {

    /**
     * Imperative approach
     * This adds a lot of explicit state that we are not interested in.
     */
    public static String nextCharForNumberString(String str) {
        String trimmed = str.trim();
        Integer number = parseInt(trimmed);
        Integer nextNumber = number + 1;
        return fromCharCode(nextNumber);
    }

    /**
     * Nested approach
     * This removes the explicit state but can be hard to read
     * since it is not entirely clear were the most nested part is.
     */
    public static String nextCharForNumberString(String str) {
        return fromCharCode(parseInt(str.trim()) + 1);
    }

    /**
     * A simple compose function looks like this:
     * 
     * const compose = (f, g) => x => g(f(x));
     * 
     * Execution order is right to left. Why? Because math says so.
     * If you want left to right execution use a pipe function instead.
     * 
     * However Ramda has a compose function that can take n functions
     * as well as a pipe function that can take a list of functions.
     * 
     * So for this purpose we will assume that we use Ramdas compose.
     */

    /**
     * Composition approach
     * This approach has no explicit state, is very readable
     * and also pointfree as an additional bonus.
     * However Java requires you to call compose several times,
     * it would have been much nicer to have a operator instead.
     * Haskell has this operator which is '.'
     */
    public static final Function<String, String> nextCharForNumberString =
        trim.compose(parseInt).compose(inc).compose(fromCharCode);

    /**
     * Piped approach
     * 
     * Same as composition but left to right execution.
     * Would likewise been nice with a pipe operator.
     * F# has this operator which is '|>'
     */
    public static final Function<String, String> nextCharForNumberString =
        fromCharCode.andThen(inc).andThen(parseInt).andThen(trim);

    /**
     * You can also compose by calling map on a functor.
     */
    public static String nextCharForNumberString(String str) {
        return Stream.of(str)
            .map(trim)
            .map(parseInt)
            .map(inc)
            .map(fromCharCode)
            .reduce(String.class, (acc, x) -> x);
    }

    public static void main(String[] args) {
        System.out.println(""); // ""
    }
}