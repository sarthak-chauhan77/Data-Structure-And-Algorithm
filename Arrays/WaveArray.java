package Arrays;

//Q. convert an array into wave array
import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        int arr[] = { 3, 6, 5, 10, 7, 20 };
        System.out.println("original array:" + Arrays.toString(arr));
        waveArray(arr);
        System.out.println("Wave array:" + Arrays.toString(arr));

    }

    private static void waveArray(int arr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
