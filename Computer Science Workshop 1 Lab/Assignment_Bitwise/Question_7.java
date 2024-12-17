// Write a program to find x^y (x raised to the power y).


import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base x: ");
        int x = sc.nextInt();
        System.out.print("Enter exponent y: ");
        int y = sc.nextInt();
        int result = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                result *= x;
            }
            x *= x;
            y >>= 1;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
