import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a number (or type 'exit' to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) break;

            int num = Integer.parseInt(input);
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
