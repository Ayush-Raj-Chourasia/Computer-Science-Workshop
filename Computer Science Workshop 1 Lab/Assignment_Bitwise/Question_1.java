// Write a Java program to count the number of bits that are set to 1 in an integer.


import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        System.out.println("Number of bits set to 1: " + count);
        sc.close();
    }
}


// Enter an integer: 55
// Number of bits set to 1: 5