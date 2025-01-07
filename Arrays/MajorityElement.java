package Arrays;

//Q.find majority element
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int result = majorityElement(arr);
        if (result != -1) {
            System.out.println("Majority Element:" + result);
        } else {
            System.out.println("No Majority Element");
        }
    }

    private static int findcandidate(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    private static int majorityElement(int[] arr) {
        int candidate = findcandidate(arr);
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
