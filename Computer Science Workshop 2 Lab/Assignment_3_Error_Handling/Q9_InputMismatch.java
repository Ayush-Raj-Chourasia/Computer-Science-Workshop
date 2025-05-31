import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9_InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
} 