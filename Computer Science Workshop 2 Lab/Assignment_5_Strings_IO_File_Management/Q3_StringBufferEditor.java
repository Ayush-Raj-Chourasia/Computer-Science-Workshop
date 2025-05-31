import java.util.Scanner;

public class Q3_StringBufferEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer("Welcome to the Text Editor!");
        boolean running = true;

        while (running) {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
            System.out.println("\nMenu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    text.append(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter text to insert: ");
                    text.insert(insertIndex, scanner.nextLine());
                    break;

                case 3:
                    System.out.print("Enter start index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endIndex = scanner.nextInt();
                    text.delete(startIndex, endIndex);
                    break;

                case 4:
                    text.reverse();
                    break;

                case 5:
                    System.out.print("Enter start index: ");
                    int replaceStart = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int replaceEnd = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter replacement text: ");
                    text.replace(replaceStart, replaceEnd, scanner.nextLine());
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
} 