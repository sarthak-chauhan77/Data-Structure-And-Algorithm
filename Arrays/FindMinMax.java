package Arrays;

// Q. Find the minimum and maximum element in an array 
public class FindMinMax {
    private FindMinMax(int arr[]) {
        int max = 0, min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
            if (arr[i] < arr[i + 1]) {
                min = arr[i];
            }
        }
        System.out.println("Max Element Is:" + max + "\nMin Value Is:" + min);
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 5, 1, 3 };
        new FindMinMax(arr);
    }
}