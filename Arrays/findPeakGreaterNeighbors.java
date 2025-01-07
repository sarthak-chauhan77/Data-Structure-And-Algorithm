package Arrays;

//Q. find Peak Greater element in array
public class findPeakGreaterNeighbors {

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 4, 9, 8 };
        findGreatestPeakNeighbor(arr);
    }

    private static void findGreatestPeakNeighbor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                System.out.println(arr[i + 1] + " is greater than their neighbors");
            }
        }
    }
}