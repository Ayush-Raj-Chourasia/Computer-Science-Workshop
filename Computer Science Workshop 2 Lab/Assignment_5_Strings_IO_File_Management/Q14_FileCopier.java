import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q14_FileCopier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        File sourceFile = new File(sourcePath);

        System.out.print("Enter destination file path: ");
        String destPath = scanner.nextLine();
        File destFile = new File(destPath);

        if (!sourceFile.exists()) {
            System.out.println("Error: Source file does not exist.");
            return;
        }

        if (destFile.exists()) {
            System.out.print("Warning: Destination file already exists. Overwrite? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("File copy cancelled.");
                return;
            }
        }

        try {
            FileInputStream source = new FileInputStream(sourceFile);
            FileOutputStream destination = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int length;
            long totalBytes = 0;

            System.out.println("\nCopying file...");
            while ((length = source.read(buffer)) > 0) {
                destination.write(buffer, 0, length);
                totalBytes += length;
                System.out.print("\rCopied: " + totalBytes + " bytes");
            }

            source.close();
            destination.close();

            System.out.println("\nFile copied successfully!");
            System.out.println("Total bytes copied: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
} 