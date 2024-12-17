import java.util.Arrays;
import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Kth Smallest: " + arr[k - 1]);
        System.out.println("Kth Largest: " + arr[n - k]);
    }
}
