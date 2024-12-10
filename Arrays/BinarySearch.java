package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("Enter Search Element:");
        try (Scanner sc = new Scanner(System.in)) {
            int search = sc.nextInt();
            binarySearch(search);
        }
    }

    private static void binarySearch(int search) {
        int arr[] = { 23, 33, 36, 45, 49, 53, 98, };
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (search == arr[mid]) {
                System.out.println("the element " + search + " is present at the position:" + (mid + 1));
                break;
            } else if (search > arr[mid]) {
                first = mid + 1;
                mid = (first + last) / 2;
            } else {
                last = mid - 1;
                mid = (first + last) / 2;
            }
        }
        if (first > last) {
            System.out.println("the element " + search + " is not present in the array");
        }
    }
}
