import java.util.Arrays;
import java.util.Scanner;

public class Q6_ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Original array: " + Arrays.toString(arr));
            
            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);

            System.out.print("Enter number to search: ");
            int searchNum = scanner.nextInt();
            int searchIndex = Arrays.binarySearch(arr, searchNum);
            if (searchIndex >= 0) {
                System.out.println("Number found at index: " + searchIndex);
            } else {
                System.out.println("Number not found in array");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
} 