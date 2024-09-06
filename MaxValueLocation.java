import java.util.Scanner;

public class  MaxValueLocation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[m][n];

        // Read the matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find the maximum value and its location
        int max = matrix[0][0];
        int maxRowIndex = 0;
        int maxColIndex = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRowIndex = i;
                    maxColIndex = j;
                }
            }
        }

        // Print the result
        System.out.println("Maximum value: " + max);
        System.out.println("Location: Row " + maxRowIndex + ", Column " + maxColIndex);

        
    }
}
