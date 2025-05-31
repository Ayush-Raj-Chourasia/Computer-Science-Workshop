import java.util.Scanner;

public class Q3_StringToInteger {
    public static int convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid numeric value: " + input);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter a number: ");
                String input = scanner.nextLine();
                int number = convertToInteger(input);
                System.out.println("Converted number: " + number);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid number.");
            }
        }
        scanner.close();
    }
} 