import java.util.function.Function;

public class Q6_FactorialLambda {
    public static Function<Integer, Integer> getFactorialFunction() {
        return n -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = getFactorialFunction();
        int[] testNumbers = {0, 1, 5, 7};
        System.out.println("Factorials:");
        for (int n : testNumbers) {
            System.out.println(n + "! = " + factorial.apply(n));
        }
    }
} 