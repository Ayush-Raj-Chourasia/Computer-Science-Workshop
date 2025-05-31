package Part_2;
import java.util.HashMap;

public class Q10_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, 1);
        }
        int missing = -1;
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }
        if (missing == -1) {
            System.out.println("No missing number in range 1-10");
        } else {
            System.out.println("Smallest missing positive number: " + missing);
        }
    }
}

/*
Output:
No missing number in range 1-10
*/ 