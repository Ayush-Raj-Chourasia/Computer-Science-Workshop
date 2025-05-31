package Part_2;
public class Q1_Pair<K, V> {
    private K key;
    private V value;

    public Q1_Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class Q1_Driver {
    public static void main(String[] args) {
        // Create different types of pairs
        Q1_Pair<String, Integer> pair1 = new Q1_Pair<>("Age", 25);
        Q1_Pair<Integer, String> pair2 = new Q1_Pair<>(1, "One");
        Q1_Pair<String, String> pair3 = new Q1_Pair<>("Name", "John");

        // Print the pairs
        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("Pair 3: " + pair3);

        // Modify and print again
        pair1.setValue(26);
        pair2.setValue("Two");
        pair3.setValue("Jane");

        System.out.println("\nAfter modification:");
        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("Pair 3: " + pair3);
    }
}

/*
Output:
Pair 1: Pair{key=Age, value=25}
Pair 2: Pair{key=1, value=One}
Pair 3: Pair{key=Name, value=John}

After modification:
Pair 1: Pair{key=Age, value=26}
Pair 2: Pair{key=1, value=Two}
Pair 3: Pair{key=Name, value=Jane}
*/ 