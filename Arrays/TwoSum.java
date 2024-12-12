package Arrays;
/*
Q. Given a 1-indexed array of integers numbers that is already in non-decreasing order.
   find two numbers such that they add up  to  a specific target number.Let these two numbers
   be numbers[index1] and numbers[index2] where i<= index1 < index2 <= numbers.length.
   Return the indices of the two numbers index1 and index2, odded by one as an integer array[index1,index2]
   of length 2.
   Note -> the test are generated such that there is exactly one solution oyu may not use the same 
   element twice.
 */
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
