package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.print("enter Row And Column for the matrix:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("enter the matrix of size:" + (rows * cols));
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is ---> ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
