package Arrays;

/*
 Q.Take a matrix as input from the user. Search for a
   given number X and print the indices at which it occurs.
 */
import java.util.Scanner;

public class TwoDSearch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num for Search:");
        int num = sc.nextInt();
        search(num);
    }

    private static void search(int num) {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (num == matrix[i][j]) {
                    System.out.print(
                            "The element " + num + " is Present at the location: (" + (i + 1) + "," + (j + 1) + ")");
                    break;
                }
            }
        }
    }
}
