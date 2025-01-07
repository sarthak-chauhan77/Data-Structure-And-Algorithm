package Arrays;

//write a program to cyclically rotate an array by 1.
import java.util.Arrays;

public class CycallyRotate {

    private CycallyRotate(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 3, 4, 2, 1, 8, 5 };
        new CycallyRotate(arr);
    }
}