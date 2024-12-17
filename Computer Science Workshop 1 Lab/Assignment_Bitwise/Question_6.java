// Write a Java program to compute x / y without arithmetic operators.

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        int quotient = 0;
        int sign = ((x < 0) ^ (y < 0)) ? -1 : 1;
        x = Math.abs(x);
        y = Math.abs(y);
        while (x >= y) {
            int tempY = y, multiple = 1;
            while (x >= (tempY << 1)) {
                tempY <<= 1;
                multiple <<= 1;
            }
            x -= tempY;
            quotient += multiple;
        }
        System.out.println("Quotient: " + (quotient * sign));
        sc.close();
    }
}
