@FunctionalInterface
interface StringProcessor {
    int process(String input);
}

public class Q1_StringProcessor {
    public static void main(String[] args) {
        // Lambda expression to get string length
        StringProcessor lengthProcessor = (str) -> str.length();

        // Test strings
        String[] testStrings = {
            "Hello",
            "Java Programming",
            "Lambda Expressions",
            "Functional Interface"
        };

        // Process each string
        System.out.println("String Lengths:");
        for (String str : testStrings) {
            int length = lengthProcessor.process(str);
            System.out.println("String: \"" + str + "\" -> Length: " + length);
        }
    }
} 