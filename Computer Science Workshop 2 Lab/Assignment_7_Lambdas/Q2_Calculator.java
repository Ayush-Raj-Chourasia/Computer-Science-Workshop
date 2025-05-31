@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class Q2_Calculator {
    public static void main(String[] args) {
        // Lambda expressions for arithmetic operations
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };

        // Test numbers
        double num1 = 10.0;
        double num2 = 5.0;

        // Perform calculations
        System.out.println("Calculator Operations:");
        System.out.println(num1 + " + " + num2 + " = " + addition.calculate(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtraction.calculate(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplication.calculate(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + division.calculate(num1, num2));

        // Test division by zero
        try {
            System.out.println(num1 + " / 0 = " + division.calculate(num1, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 