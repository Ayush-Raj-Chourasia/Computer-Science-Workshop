import java.io.File;
import java.util.Scanner;

public class Q13_FileDeleter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path to delete: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: File does not exist.");
            return;
        }

        if (file.isDirectory()) {
            System.out.println("Error: Cannot delete a directory.");
            return;
        }

        System.out.println("File details:");
        System.out.println("Name: " + file.getName());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last modified: " + new java.util.Date(file.lastModified()));

        System.out.print("\nAre you sure you want to delete this file? (yes/no): ");
        String confirmation = scanner.nextLine().toLowerCase();

        if (confirmation.equals("yes")) {
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Error: Failed to delete the file.");
            }
        } else {
            System.out.println("File deletion cancelled.");
        }

        scanner.close();
    }
} 