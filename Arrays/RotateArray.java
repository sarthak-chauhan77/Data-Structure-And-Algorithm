//Q. Given an array of Size N.The task is to left rotate array by D elements where D<=N.
//given:{2,3,4,5,6} ----> Output:{4,5,6,2,3}
//Expected Time Complexity: O(N) 
//Expected Auxillary Space: O(1)
package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        Rotate(arr, arr.length, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void Rotate(int arr[], int N, int D) {
        Rev(arr, 0, D - 1);
        Rev(arr, D, N - 1);
        Rev(arr, 0, N - 1);
    }

    public static void Rev(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
}
