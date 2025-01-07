package Arrays;

//Q. find first non repeating element
public class findFirstNonRepeating {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 2, 6, 7, 4 };
        int result = findNonRepeating(arr);
        if (result != -1) {
            System.out.println("First Non-repeating element is:" + result);
        } else {
            System.out.println("No Non-Repeating element found");
        }
    }

    private static int findNonRepeating(int[] arr) {
        int maxRange = 100;
        int[] count = new int[maxRange];
        for (int num : arr) {
            count[num]++;
        }
        for (int num : arr) {
            if (count[num] == 1) {
                return num;
            }
        }
        return -1;
    }
}
