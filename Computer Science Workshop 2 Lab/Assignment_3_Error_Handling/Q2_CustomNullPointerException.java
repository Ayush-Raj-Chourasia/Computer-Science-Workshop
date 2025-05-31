class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q2_CustomNullPointerException {
    public static void processObject(Object obj) {
        if (obj == null) {
            throw new CustomNullPointerException("Object cannot be null");
        }
        System.out.println("Processing object: " + obj);
    }

    public static void main(String[] args) {
        try {
            processObject("Valid Object");
            processObject(null);
        } catch (CustomNullPointerException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
} 