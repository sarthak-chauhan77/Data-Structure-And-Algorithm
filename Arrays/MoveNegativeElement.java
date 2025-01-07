package Arrays;

import java.util.Arrays;

//Q.Move all the Negative Elements to one side of the array
public class MoveNegativeElement {
    private MoveNegativeElement(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] < 0) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 2, -1, -3, 3, -5, 7 };
        new MoveNegativeElement(arr);
    }
}
