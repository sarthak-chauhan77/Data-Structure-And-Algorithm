package Arrays;

//Q. sort an array
import java.util.Arrays;

public class SortArray {
    private static void sortArray(int arr[]) {
        int low = 0, traverse = 0, high = arr.length - 1;
        while (traverse <= high) {
            switch (arr[traverse]) {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[traverse];
                    arr[traverse] = temp0;
                    low++;
                    traverse++;
                    break;
                case 1:
                    traverse++;
                    break;
                case 2:
                    int temp2 = arr[traverse];
                    arr[traverse] = arr[high];
                    arr[high] = temp2;
                    high--;

                    break;
                default:
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 0, 1 };
        sortArray(arr);
    }
}
