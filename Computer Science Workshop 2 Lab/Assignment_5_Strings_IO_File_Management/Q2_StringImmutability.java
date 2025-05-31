public class Q2_StringImmutability {
    public static void main(String[] args) {
        // Demonstrating String immutability
        String original = "Hello";
        System.out.println("Original string: " + original);
        System.out.println("Hash code before modification: " + original.hashCode());

        // Attempting to modify the string
        String modified = original.concat(" World");
        System.out.println("\nAfter concat operation:");
        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + modified);
        System.out.println("Hash code of original: " + original.hashCode());
        System.out.println("Hash code of modified: " + modified.hashCode());

        // Demonstrating CharSequence interface
        System.out.println("\nCharSequence operations:");
        CharSequence seq = original;
        System.out.println("Length: " + seq.length());
        System.out.println("Char at index 0: " + seq.charAt(0));
        System.out.println("Subsequence (0,3): " + seq.subSequence(0, 3));

        // String methods that return new strings
        System.out.println("\nString methods that return new strings:");
        String upper = original.toUpperCase();
        String lower = original.toLowerCase();
        String trimmed = "  Hello  ".trim();
        
        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Trimmed: " + trimmed);
        
        // Hash codes to show different objects
        System.out.println("\nHash codes of different string objects:");
        System.out.println("Original: " + original.hashCode());
        System.out.println("Uppercase: " + upper.hashCode());
        System.out.println("Lowercase: " + lower.hashCode());
        System.out.println("Trimmed: " + trimmed.hashCode());
    }
} 