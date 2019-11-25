import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

public class Main {

    /**
     * A recursive function solves one part of the problem and then calls itself until
     * it has exhaustively solved the entire problem.
     * 
     * A recursive function requires a base case on which it terminates. Otherwise the function will
     * create an infinite loop that consumes the entire call stack.
     */

    public static <T, U> List<U> map(final Function<T, U> f, final List<T> xs) {
        return xs == null || xs.isEmpty() ?
            List.of() :
            Stream.concat(
                    Stream.of(f.apply(xs.get(0))),
                    map(f, xs.subList(1, xs.size())).stream())
                .collect(Collectors.toList());
    }

    public static void main(final String[] args) {
        System.out.println(map(x -> x * 2, List.of(1, 2, 3, 4, 5)));
    }
}
