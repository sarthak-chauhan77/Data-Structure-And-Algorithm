package Arrays;

//Q.find Row of Maximum One's
public class FindRowOfOnes {
    public static void main(String[] args) {
        int matrix[][] = { { 3, 4, 5, 2, 1 }, { 5, 1, 1, 4, 1 }, { 1, 5, 1, 3, 1 } };
        int result = findMaxRowWithOnes(matrix);
        System.out.println(result + 1);
    }

    private static int findMaxRowWithOnes(int matrix[][]) {
        int maxRowIndex = -1;
        int maxOnes = 0;
        for (int i = 0; i < matrix.length; i++) {
            int currentRowOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    currentRowOnes++;
                }
            }
            if (currentRowOnes > maxOnes) {
                maxOnes = currentRowOnes;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}
