class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Q8_CustomCheckedException {
    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 0 || age > 150) {
            throw new CustomCheckedException("Invalid age: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5);
            validateAge(200);
        } catch (CustomCheckedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 