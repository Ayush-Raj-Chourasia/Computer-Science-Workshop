import java.util.Scanner;

public class Q5_CaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Convert to lowercase
        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        // Convert to uppercase
        String str1Upper = str1.toUpperCase();
        String str2Upper = str2.toUpperCase();

        // Display converted strings
        System.out.println("\nConverted Strings:");
        System.out.println("First string (lowercase): " + str1Lower);
        System.out.println("First string (uppercase): " + str1Upper);
        System.out.println("Second string (lowercase): " + str2Lower);
        System.out.println("Second string (uppercase): " + str2Upper);

        // Compare strings
        System.out.println("\nComparison Results:");
        System.out.println("Case-sensitive comparison: " + str1.equals(str2));
        System.out.println("Case-insensitive comparison: " + str1.equalsIgnoreCase(str2));
        System.out.println("Lowercase comparison: " + str1Lower.equals(str2Lower));
        System.out.println("Uppercase comparison: " + str1Upper.equals(str2Upper));

        scanner.close();
    }
} 