package Arrays;

//Q. Reverse the array
import java.util.Arrays;

public class ReverseArray {
    private ReverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 7, 9, 3, 4, 2 };
        new ReverseArray(arr, 0, arr.length - 1);
    }
}
