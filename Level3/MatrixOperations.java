package Level_3;
import java.util.Random;

public class MatrixOperations {
    static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(9) + 1;
        return matrix;
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    static int[][] transposeMatrix(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = createMatrix(3, 3);
        int[][] b = createMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(a);
        System.out.println("\nMatrix B:");
        displayMatrix(b);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(a, b));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(a, b));

        System.out.println("\nA x B:");
        displayMatrix(multiplyMatrices(a, b));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(a));

        System.out.println("\nDeterminant of A (3x3): " + determinant3x3(a));

        double[][] inv2x2 = inverse2x2(new int[][]{{1, 2}, {3, 4}});
        System.out.println("\nInverse of 2x2 Matrix:");
        if (inv2x2 != null) displayMatrix(inv2x2);
        else System.out.println("Not invertible");
    }
}
