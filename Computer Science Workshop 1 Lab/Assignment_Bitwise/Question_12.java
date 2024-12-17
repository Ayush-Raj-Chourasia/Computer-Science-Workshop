// Write a Java program that reads two integer numbers and creates a third number 
// by taking the first two digits of the first number and the last two digits of the second number.
// Example: Input: 45678, 312 Output: 4512


import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        String firstTwo = String.valueOf(num1).substring(0, 2);
        String lastTwo = String.valueOf(num2).substring(String.valueOf(num2).length() - 2);
        System.out.println("Result: " + firstTwo + lastTwo);
        sc.close();
    }
}
