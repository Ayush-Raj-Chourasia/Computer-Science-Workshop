import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading double as a string
        System.out.print("Enter a double as a string: ");
        String doubleStr = sc.nextLine();

        // Converting string to Double object
        Double obj = Double.valueOf(doubleStr);
        System.out.println("Converted Double Object: " + obj);
    }
}
