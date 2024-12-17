// Write a program to check whether a number is palindrome or not.


import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Palindrome: " + (original == reversed));
        sc.close();
    }
}
