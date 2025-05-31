import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q11_FileReader {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as command line argument");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
} 