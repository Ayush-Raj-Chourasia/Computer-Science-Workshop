import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double as a string: ");
        String doubleStr = sc.nextLine();

        // Convert to Double object and unbox to primitive
        Double obj = Double.valueOf(doubleStr); // Wrapping
        double baseValue = obj.doubleValue();   // Unboxing

        System.out.println("Double Base Type Value: " + baseValue);
    }
}
