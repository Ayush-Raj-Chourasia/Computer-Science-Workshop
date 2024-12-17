// Write a Java program that reads two float numbers and checks whether the
// difference between these two numbers is less than ϵ (ϵ < 1).


import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float b = sc.nextFloat();
        float epsilon = 1.0f;
        System.out.println("Difference less than ε: " + (Math.abs(a - b) < epsilon));
        sc.close();
    }
}
