// Write a program that takes a 64-bit word and returns the 64-bit word 
// consisting of the bits of the input word in reverse order. For example, 
// if the input is alternating 1s and 0s, i.e., (1010...10), the output should 
// be alternating 0s and 1s, i.e., (0101...01).


import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 64-bit number: ");
        long num = sc.nextLong();
        long reversed = 0;
        for (int i = 0; i < 64; i++) {
            reversed <<= 1;
            reversed |= (num & 1);
            num >>= 1;
        }
        System.out.println("Reversed 64-bit word: " + reversed);
        sc.close();
    }
}
