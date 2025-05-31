package Part_2;
import java.util.PriorityQueue;

public class Q11_MinHeap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }
        System.out.println("Elements in ascending order:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
}

/*
Output:
Elements in ascending order:
1 2 3 4 5 6 7 8 9 10 
*/ 