// Q2. The parity of a binary word is 1 if the number of 1s in the word is odd; 
// otherwise, it is 0. Write a Java program to count the parity of an integer number.


import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int parity = 0;
        while (num != 0) {
            parity ^= num & 1;
            num >>= 1;
        }
        System.out.println("Parity of the integer: " + parity);
        sc.close();
    }
}



// Enter an integer: 45
// Parity of the integer: 0