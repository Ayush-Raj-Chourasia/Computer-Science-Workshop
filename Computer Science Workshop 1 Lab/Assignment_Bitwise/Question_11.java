// Write a Java program that reads an integer number and counts the number of 
// digits that are even.


import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            if ((num % 10) % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Count of even digits: " + count);
        sc.close();
    }
}
