// Write a program that returns true if the number is even, 
// else returns false. Note: Don’t use if-else.


import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isEven = (num % 2 == 0);
        System.out.println("Even: " + isEven);
        sc.close();
    }
}
