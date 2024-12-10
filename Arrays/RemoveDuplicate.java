package Arrays;

//Q. Remove Duplicae From Sorted Array:{1,1,2,3,4,4,5} --> Output:{1,2,3,4,5}
//Time Complexity: O(n)
//Space Complexity: O(1)
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 5 };
        int unique = remooveDuplicate(arr);
        for (int i = 0; i < unique; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static int remooveDuplicate(int arr[]) {
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique += 1;
                arr[unique - 1] = arr[i];
            }
        }
        return unique;
    }
}
