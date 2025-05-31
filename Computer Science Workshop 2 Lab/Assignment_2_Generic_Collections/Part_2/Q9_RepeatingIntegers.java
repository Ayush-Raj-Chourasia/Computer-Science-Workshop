package Part_2;
import java.util.HashSet;

public class Q9_RepeatingIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }
        System.out.println("Repeating integers: " + repeating);
    }
}

/*
Output:
Repeating integers: [1, 2, 3]
*/ 