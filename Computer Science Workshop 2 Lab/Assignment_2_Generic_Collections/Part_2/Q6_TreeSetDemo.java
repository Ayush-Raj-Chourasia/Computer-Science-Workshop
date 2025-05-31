package Part_2;
import java.util.Scanner;
import java.util.TreeSet;

public class Q6_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(10);
        set.add(7);

        System.out.println("TreeSet elements: " + set);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();
        System.out.println("Present? " + set.contains(num));
        
        System.out.print("Enter a number to remove: ");
        int rem = sc.nextInt();
        boolean removed = set.remove(rem);
        System.out.println("Removed? " + removed);
        System.out.println("TreeSet after removal: " + set);
        sc.close();
    }
}

/*
Sample Output:
TreeSet elements: [1, 2, 5, 7, 8, 10]
Enter a number to search: 7
Present? true
Enter a number to remove: 2
Removed? true
TreeSet after removal: [1, 5, 7, 8, 10]
*/ 