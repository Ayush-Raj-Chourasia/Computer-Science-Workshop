package Part_2;
import java.util.HashMap;

public class Q8_Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!freq.containsKey(c)) return false;
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) freq.remove(c);
        }
        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + " and " + str2 + " are anagrams? " + areAnagrams(str1, str2));

        str1 = "triangle";
        str2 = "integral";
        System.out.println(str1 + " and " + str2 + " are anagrams? " + areAnagrams(str1, str2));

        str1 = "hello";
        str2 = "world";
        System.out.println(str1 + " and " + str2 + " are anagrams? " + areAnagrams(str1, str2));
    }
}

/*
Output:
listen and silent are anagrams? true
triangle and integral are anagrams? true
hello and world are anagrams? false
*/ 