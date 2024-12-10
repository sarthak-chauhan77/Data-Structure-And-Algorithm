package Arrays;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        throw new IllegalArgumentException("No solution found");

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 11 };
        int target = 10;
        int result[] = twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
