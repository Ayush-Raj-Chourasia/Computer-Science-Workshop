public class Q7_MatrixOperations {
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new ArrayIndexOutOfBoundsException("Matrices must have same dimensions for addition");
        }
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid dimensions for matrix multiplication");
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            int[][] matrix1 = {{1, 2}, {3, 4}};
            int[][] matrix2 = {{5, 6}, {7, 8}};

            System.out.println("Matrix 1:");
            printMatrix(matrix1);
            System.out.println("\nMatrix 2:");
            printMatrix(matrix2);

            System.out.println("\nAddition Result:");
            printMatrix(addMatrices(matrix1, matrix2));

            System.out.println("\nMultiplication Result:");
            printMatrix(multiplyMatrices(matrix1, matrix2));

            System.out.println("\nTranspose of Matrix 1:");
            printMatrix(transposeMatrix(matrix1));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Unexpected error occurred");
        }
    }
} 