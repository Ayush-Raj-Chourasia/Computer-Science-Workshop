public class Q1_NumberExtractor {
    public static void extractNumbers(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty");
        }

        StringBuilder numbers = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        if (numbers.length() == 0) {
            System.out.println("No numeric characters found in the input string.");
        } else {
            System.out.println("Numeric characters found: " + numbers);
        }
    }

    public static void main(String[] args) {
        try {
            extractNumbers("Hello123World456");
            extractNumbers("NoNumbersHere");
            extractNumbers(null);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 