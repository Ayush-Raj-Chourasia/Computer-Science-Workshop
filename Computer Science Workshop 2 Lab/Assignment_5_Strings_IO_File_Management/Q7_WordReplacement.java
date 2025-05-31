import java.util.Scanner;

public class Q7_WordReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to search: ");
        String searchWord = scanner.nextLine();

        System.out.print("Enter word to replace with: ");
        String replaceWord = scanner.nextLine();

        System.out.println("\nOriginal sentence: " + sentence);

        // Find the first occurrence of the search word
        int index = sentence.indexOf(searchWord);
        if (index != -1) {
            // Replace the word using substring operations
            String modifiedSentence = sentence.substring(0, index) + 
                                    replaceWord + 
                                    sentence.substring(index + searchWord.length());
            
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            System.out.println("Word '" + searchWord + "' not found in the sentence.");
        }

        scanner.close();
    }
} 