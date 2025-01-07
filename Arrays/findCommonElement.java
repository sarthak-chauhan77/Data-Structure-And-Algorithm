package Arrays;

import java.util.ArrayList;
import java.util.List;

//Q.find Common element in three sorted array
public class findCommonElement {
    public static void main(String[] args) {
        int a[] = { 5, 10, 20, 40, 80 };
        int b[] = { 7, 20, 80, 100 };
        int c[] = { 4, 15, 20, 30, 70, 80, 120 };
        findCommonValues(a, b, c);
    }

    private static void findCommonValues(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                result.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println(result);
    }
}
