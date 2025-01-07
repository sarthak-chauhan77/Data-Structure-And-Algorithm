package Arrays;

//Q.find Dupicate in an array
public class FindDuplicate {

    public static void main(String[] args) {
        int arr[] = { 9, 8, 1, 1, 8, 5 };
        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
