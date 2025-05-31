class PrimeThread extends Thread {
    private int start, end;
    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
            }
        }
    }
}

public class Q7_PrimeGenerator {
    public static void main(String[] args) {
        int limit = 50;
        int numThreads = 4;
        int range = limit / numThreads;
        PrimeThread[] threads = new PrimeThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * range;
            threads[i] = new PrimeThread(start, end);
            threads[i].start();
        }
        for (PrimeThread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 