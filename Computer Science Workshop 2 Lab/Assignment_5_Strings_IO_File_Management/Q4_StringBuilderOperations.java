import java.util.Scanner;

public class Q4_StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder("Initial Text");
        boolean running = true;

        while (running) {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("\nMenu:");
            System.out.println("1. Add substring at position");
            System.out.println("2. Remove range of characters");
            System.out.println("3. Modify character at index");
            System.out.println("4. Concatenate string");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter substring: ");
                    text.insert(pos, scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Enter start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int end = scanner.nextInt();
                    text.delete(start, end);
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new character: ");
                    String newChar = scanner.nextLine();
                    text.setCharAt(index, newChar.charAt(0));
                    break;

                case 4:
                    System.out.print("Enter string to concatenate: ");
                    text.append(scanner.nextLine());
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
} 