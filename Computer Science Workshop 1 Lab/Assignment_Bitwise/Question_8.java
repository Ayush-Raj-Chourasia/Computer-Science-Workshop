// Write a program to find the reverse of a number. For example, if the input is 
// 123 output is 321, and if the input is -245 output is -542.


import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed number: " + (reversed * sign));
        sc.close();
    }
}
