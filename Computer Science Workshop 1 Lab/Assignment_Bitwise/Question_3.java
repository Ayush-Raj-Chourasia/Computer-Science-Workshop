// Write a program to swap the i-th bit with j-th bit of a number.



import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the position of i (0-based): ");
        int i = sc.nextInt();
        System.out.print("Enter the position of j (0-based): ");
        int j = sc.nextInt();

        int bit1 = (num >> i) & 1;
        int bit2 = (num >> j) & 1;

        if (bit1 != bit2) {
            num ^= (1 << i);
            num ^= (1 << j);
        }
        System.out.println("Number after swapping: " + num);
        sc.close();
    }
}
