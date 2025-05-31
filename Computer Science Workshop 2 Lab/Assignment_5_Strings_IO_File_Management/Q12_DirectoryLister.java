import java.io.File;
import java.util.Scanner;

public class Q12_DirectoryLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();
        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("Error: Directory does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("Error: Path is not a directory.");
            return;
        }

        System.out.println("\nContents of " + path + ":");
        System.out.println("----------------------------------------");

        // List all files and directories
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("[DIR] " + file.getName());
                } else {
                    System.out.println("[FILE] " + file.getName() + 
                                     " (" + file.length() + " bytes)");
                }
            }
        }

        scanner.close();
    }
} 