package Arrays;

//Q. find subArray of given sum
public class subArrayGivenSum {
    public static void main(String[] args) {
        int givenSum = 3;
        int arr[] = { 5, 7, 3, 7, 5, 6 };
        subArraySum(arr, givenSum);

    }

    private static void subArraySum(int[] arr, int givenSum) {
        int sum = 0, end, start = 0;
        for (end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > givenSum && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum == givenSum) {
                System.out.println("Target sum subarray is from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No Subarray with the given sum found ");
    }
}