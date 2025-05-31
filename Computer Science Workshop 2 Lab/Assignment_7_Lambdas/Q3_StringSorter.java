import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q3_StringSorter {
    public static void main(String[] args) {
        // List of strings to sort
        List<String> strings = Arrays.asList(
            "Java",
            "Python",
            "JavaScript",
            "C++",
            "Ruby",
            "TypeScript",
            "Go"
        );

        // Display original list
        System.out.println("Original List:");
        strings.forEach(System.out::println);

        // Sort using lambda expression comparator
        strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        // Display sorted list
        System.out.println("\nSorted List (by length in descending order):");
        strings.forEach(System.out::println);

        // Alternative way using Comparator.comparing
        System.out.println("\nAlternative sorting using Comparator.comparing:");
        strings.stream()
               .sorted(Comparator.comparing(String::length).reversed())
               .forEach(System.out::println);
    }
} 