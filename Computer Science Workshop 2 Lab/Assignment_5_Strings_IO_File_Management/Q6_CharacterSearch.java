import java.util.Scanner;

public class Q6_CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();

        System.out.print("Enter a character to search: ");
        char searchChar = scanner.nextLine().charAt(0);

        // Display character array
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        // Find first occurrence
        int firstIndex = input.indexOf(searchChar);
        // Find last occurrence
        int lastIndex = input.lastIndexOf(searchChar);

        System.out.println("\nSearch Results:");
        if (firstIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
            System.out.println("Last occurrence at index: " + lastIndex);
            
            // Count occurrences
            int count = 0;
            for (char c : charArray) {
                if (c == searchChar) {
                    count++;
                }
            }
            System.out.println("Total occurrences: " + count);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();
    }
} 