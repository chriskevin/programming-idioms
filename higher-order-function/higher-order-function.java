import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunction {

    /**
     * A higher order function is a function that takes a function as an argument.
     * Higher order functions can also return a function depending on it's use case.
     * This replaces the Strategy pattern from the OOP Design Patterns.
     * Higher order functions allow us to write more generic code and inject the specific details.
     */
    public static <T, U> List<U> map(Function<T, U> fn, List<T> list) {
        List<U> newList = new ArrayList<>();
        
        for (T item : list) {
            newList.add(fn.apply(item));
        }

        return newList;
    }

    public static void main(String[] args) {
        System.out.println(HigherOrderFunction.<Integer, Integer>map(x -> x + 5, Arrays.asList(1, 2, 3, 4, 5))); // [6, 7, 8, 9, 10]
    }
}