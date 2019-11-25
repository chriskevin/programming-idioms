import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static Integer multiply(final Integer x, final Integer y) {
        return x * y;
    }

    // A curried function that can be partially applied is necessary for pointfree style.
    public static Function<Integer, Function<Integer, Integer>> curriedMultiply = x -> y -> x * y;

    public static void main(final String[] args) {
        // With pointful style it is necessary to explicitly specify the argument.
        System.out.println(
            List.of(1, 2, 3, 4, 5)
            .stream()
            .map(x -> multiply(2, x))
            .collect(Collectors.toList())); // [2, 4, 6, 8, 10]

        // With pointfree style the argument is implicitly applied.
        System.out.println(
            List.of(1, 2, 3, 4, 5)
            .stream()
            .map(curriedMultiply.apply(2))
            .collect(Collectors.toList())); // [2, 4, 6, 8, 10]
    }
}