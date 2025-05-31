import java.util.Scanner;

class AdditionThread extends Thread {
    private double a, b;
    public AdditionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
    }
}

class SubtractionThread extends Thread {
    private double a, b;
    public SubtractionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    }
}

class MultiplicationThread extends Thread {
    private double a, b;
    public MultiplicationThread(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }
}

class DivisionThread extends Thread {
    private double a, b;
    public DivisionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        if (b == 0) {
            System.out.println("Division: Cannot divide by zero.");
        } else {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        }
    }
}

public class Q2_MultithreadedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        scanner.close();

        AdditionThread addThread = new AdditionThread(a, b);
        SubtractionThread subThread = new SubtractionThread(a, b);
        MultiplicationThread mulThread = new MultiplicationThread(a, b);
        DivisionThread divThread = new DivisionThread(a, b);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
} 