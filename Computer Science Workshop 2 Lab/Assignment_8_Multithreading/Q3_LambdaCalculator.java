import java.util.Scanner;

public class Q3_LambdaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        scanner.close();

        Thread addThread = new Thread(() -> System.out.println("Addition: " + a + " + " + b + " = " + (a + b)));
        Thread subThread = new Thread(() -> System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b)));
        Thread mulThread = new Thread(() -> System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b)));
        Thread divThread = new Thread(() -> {
            if (b == 0) {
                System.out.println("Division: Cannot divide by zero.");
            } else {
                System.out.println("Division: " + a + " / " + b + " = " + (a / b));
            }
        });

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
} 