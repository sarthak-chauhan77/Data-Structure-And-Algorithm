package Arrays;

//Q. find the Occurence of an integer in array
public class FindOccurrence {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 6, 8, 2, 6 };
        findOccurrence(arr);
    }

    private static void findOccurrence(int arr[]) {
        int occurrenece = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    occurrenece++;
                    val = arr[i];
                    break; // Optional: To avoid printing the same duplicate multiple times
                }
            }
        }
        System.out.println("the value " + val + " occur " + occurrenece + " times");

    }
}
