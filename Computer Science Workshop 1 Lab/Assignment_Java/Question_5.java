import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading integer as a string
        System.out.print("Enter an integer as a string: ");
        String intStr = sc.nextLine();

        // Converting string to Integer object
        Integer obj = Integer.valueOf(intStr);
        System.out.println("Converted Integer Object: " + obj);
    }
}
