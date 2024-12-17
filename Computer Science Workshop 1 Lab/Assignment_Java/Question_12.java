import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String intStr = sc.nextLine();

        // Convert to Integer object and unbox to primitive
        Integer obj = Integer.valueOf(intStr); // Wrapping
        int baseValue = obj.intValue();        // Unboxing

        System.out.println("Integer Base Type Value: " + baseValue);
    }
}
