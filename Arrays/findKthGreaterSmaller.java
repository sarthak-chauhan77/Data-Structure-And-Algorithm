package Arrays;

//Q. find Kth greater and Smaller Element in an array
import java.util.Arrays;

public class findKthGreaterSmaller {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 5, 7, 2, 3, 68, 54, 45, 43 };
        findKthGreatestAndSmallest(arr, k);
    }

    private static void findKthGreatestAndSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        int KthMax = arr[arr.length - k];
        int KthSmallest = arr[k - 1];
        System.out.println(k + " Greater element is " + KthMax + " \n" + k + " Smaller element is " + KthSmallest);

    }

}
