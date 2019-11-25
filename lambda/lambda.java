import java.util.function.Function;

public class Main {

    // Regular function (Kind of, close enough since Java insists on creating classes)
    public static Integer regularFn(final Integer x) {
        return x + x;
    }

    // Lambda
    public static final Function<Integer, Integer> lambdaFn = x -> x + x;

    public static void main(final String[] args) {
        System.out.println(regularFn(2)); // 4
        System.out.println(lambdaFn.apply(4)); // 8
    }
}
