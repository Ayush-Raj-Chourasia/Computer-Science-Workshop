import java.util.Scanner;

public class Q4_SquareRoot {
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            double result = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
} 