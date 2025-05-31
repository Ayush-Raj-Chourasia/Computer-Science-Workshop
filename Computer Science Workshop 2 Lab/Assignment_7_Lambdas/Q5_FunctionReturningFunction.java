import java.util.function.Function;

public class Q5_FunctionReturningFunction {
    public static Function<Integer, Integer> getSquareFunction() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = getSquareFunction();
        int[] numbers = {2, 5, 10, -3};
        System.out.println("Squares:");
        for (int n : numbers) {
            System.out.println(n + " squared = " + squareFunction.apply(n));
        }
    }
} 