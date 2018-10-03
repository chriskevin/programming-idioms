import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PointFree {

    public static Integer multiply(Integer x, Integer y) {
        return x * y;
    }

    /**
     * A curried function that can be partially applied is necessary for pointfree style.
     */
    public static Function<Integer, Function<Integer, Integer>> curriedMultiply = x -> y -> x * y;

    public static void main(String[] args) {
        /**
        * In a pointful scenario it is necessary to explicitly specify the parameter.
        */
        System.out.println(Arrays.asList(12, 24, 5).stream().map(x -> multiply(2, x)).collect(Collectors.toList())); // [24, 48, 10]

        /**
        * In a pointfree scenario we do not care about the argument and let it be implicitly applied.
        */
        System.out.println(Arrays.asList(12, 24, 5).stream().map(curriedMultiply.apply(2)).collect(Collectors.toList())); // [24, 48, 10]
    }
}