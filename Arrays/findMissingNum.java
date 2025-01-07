package Arrays;

//Q. find Missing integerin an array
public class findMissingNum {

    public static void main(String[] args) {
        int[] A = { 1, 2, 4, 5, 6 };
        /* 1. */System.out.println("Missing integer is:" + findMissingInteger(A));
        /* 2. */System.out.println("Missing Value is:" + findMissingValue(A));

    }

    private static int findMissingInteger(int a[]) {
        int n = a.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : a) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    private static int findMissingValue(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                return i + 1;
            }
        }
        return 0;
    }
}