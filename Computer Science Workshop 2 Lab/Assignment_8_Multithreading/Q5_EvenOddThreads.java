class NumberPrinter {
    private boolean isEvenTurn = true;

    public synchronized void printEven(int number) {
        while (!isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even: " + number);
        isEvenTurn = false;
        notify();
    }

    public synchronized void printOdd(int number) {
        while (isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd: " + number);
        isEvenTurn = true;
        notify();
    }
}

class EvenThread extends Thread {
    private NumberPrinter printer;
    private int max;

    public EvenThread(NumberPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    private NumberPrinter printer;
    private int max;

    public OddThread(NumberPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class Q5_EvenOddThreads {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        int max = 10;
        EvenThread evenThread = new EvenThread(printer, max);
        OddThread oddThread = new OddThread(printer, max);
        evenThread.start();
        oddThread.start();
    }
} 