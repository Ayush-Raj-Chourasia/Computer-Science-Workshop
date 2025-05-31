import java.util.Scanner;

class MatrixMultiplierThread extends Thread {
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;
    private int startRow;
    private int endRow;

    public MatrixMultiplierThread(int[][] matrixA, int[][] matrixB, int[][] result, int startRow, int endRow) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.result = result;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    public void run() {
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }
}

public class Q4_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        System.out.print("Enter number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        scanner.close();

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[colsA][colsB];
        int[][] result = new int[rowsA][colsB];

        // Initialize matrices (for simplicity, using random values)
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < colsA; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }

        int numThreads = 4; // Number of threads
        int rowsPerThread = rowsA / numThreads;
        MatrixMultiplierThread[] threads = new MatrixMultiplierThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int startRow = i * rowsPerThread;
            int endRow = (i == numThreads - 1) ? rowsA : (i + 1) * rowsPerThread;
            threads[i] = new MatrixMultiplierThread(matrixA, matrixB, result, startRow, endRow);
            threads[i].start();
        }

        for (MatrixMultiplierThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
} 