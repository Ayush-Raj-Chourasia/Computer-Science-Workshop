// Write a Java program to compute x × y without arithmetic operators.


import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        int result = 0;
        while (y != 0) {
            if ((y & 1) == 1) {
                result += x;
            }
            x <<= 1;
            y >>= 1;
        }
        System.out.println("Product: " + result);
        sc.close();
    }
}
