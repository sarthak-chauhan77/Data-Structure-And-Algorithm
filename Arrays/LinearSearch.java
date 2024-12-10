package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        linearSearch();
    }

    public static void linearSearch() {
        int i = 0;
        System.out.print("Enter Search Element:");
        try (Scanner sc = new Scanner(System.in)) {
            int search = sc.nextInt();
            int arr[] = { 828, 43, 45, 4, 2, 125, 455, 2234 };
            for (i = 0; i < arr.length; i++) {
                if (search == arr[i]) {
                    System.out.print("the element " + search + " is present at index num:" + (i + 1));
                    break;
                }
            }
            if (i == arr.length) {
                System.out.println("the element " + search + " is not present in the array");
            }
        }
    }
}
