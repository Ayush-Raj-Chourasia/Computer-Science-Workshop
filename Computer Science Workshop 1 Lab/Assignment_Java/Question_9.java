import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs as strings
        System.out.print("Enter an integer as a string: ");
        String intStr = sc.nextLine();

        System.out.print("Enter a float as a string: ");
        String floatStr = sc.nextLine();

        System.out.print("Enter a double as a string: ");
        String doubleStr = sc.nextLine();

        System.out.print("Enter a boolean as a string (true/false): ");
        String boolStr = sc.nextLine();

        // Converting to respective object types using valueOf()
        Integer intObj = Integer.valueOf(intStr);
        Float floatObj = Float.valueOf(floatStr);
        Double doubleObj = Double.valueOf(doubleStr);
        Boolean boolObj = Boolean.valueOf(boolStr);

        // Displaying the converted objects
        System.out.println("Converted Integer Object: " + intObj);
        System.out.println("Converted Float Object: " + floatObj);
        System.out.println("Converted Double Object: " + doubleObj);
        System.out.println("Converted Boolean Object: " + boolObj);
    }
}


// Enter an integer as a string: 123
// Enter a float as a string: 12.34
// Enter a double as a string: 123.456
// Enter a boolean as a string (true/false): true
// Converted Integer Object: 123
// Converted Float Object: 12.34
// Converted Double Object: 123.456
// Converted Boolean Object: true
