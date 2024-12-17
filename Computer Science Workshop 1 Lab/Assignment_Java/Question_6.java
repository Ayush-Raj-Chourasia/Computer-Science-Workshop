import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading float as a string
        System.out.print("Enter a float as a string: ");
        String floatStr = sc.nextLine();

        // Converting string to Float object
        Float obj = Float.valueOf(floatStr);
        System.out.println("Converted Float Object: " + obj);
    }
}
