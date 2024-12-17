import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading boolean as a string
        System.out.print("Enter a boolean as a string (true/false): ");
        String boolStr = sc.nextLine();

        // Converting string to Boolean object
        Boolean obj = Boolean.valueOf(boolStr);
        System.out.println("Converted Boolean Object: " + obj);
    }
}
