import java.util.Scanner;

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }
}

class MultiplicationTableThread extends Thread {
    private int number;
    public MultiplicationTableThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Q1_MultiTaskThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int num = scanner.nextInt();
        scanner.close();

        SumThread sumThread = new SumThread();
        MultiplicationTableThread tableThread = new MultiplicationTableThread(num);

        sumThread.start();
        tableThread.start();
    }
} 