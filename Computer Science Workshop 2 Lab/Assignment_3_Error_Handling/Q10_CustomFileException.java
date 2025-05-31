import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class CustomFileNotFoundException extends FileNotFoundException {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

class CustomFileReadPermissionException extends IOException {
    public CustomFileReadPermissionException(String message) {
        super(message);
    }
}

public class Q10_CustomFileException {
    public static void readFile(String filePath) throws CustomFileNotFoundException, CustomFileReadPermissionException {
        if (filePath == null) {
            throw new CustomFileNotFoundException("File path cannot be null");
        }

        File file = new File(filePath);
        if (!file.exists()) {
            throw new CustomFileNotFoundException("File does not exist: " + filePath);
        }

        if (!file.canRead()) {
            throw new CustomFileReadPermissionException("No permission to read file: " + filePath);
        }

        System.out.println("File can be read successfully");
    }

    public static void main(String[] args) {
        try {
            readFile(args[0]);
        } catch (CustomFileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CustomFileReadPermissionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide a file path as command line argument");
        }
    }
} 