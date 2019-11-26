public class Main {

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
     * Composition approach
     * 
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
