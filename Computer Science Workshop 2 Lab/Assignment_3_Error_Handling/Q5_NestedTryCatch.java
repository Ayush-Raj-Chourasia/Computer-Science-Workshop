import java.util.Scanner;

public class Q5_NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                try {
                    int result = 100 / number;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format");
            }
        } catch (Exception e) {
            System.out.println("Error: Unexpected error occurred");
        } finally {
            scanner.close();
        }
    }
} 