package Arrays;

//Q. find subset of an array
import java.util.Arrays;
import java.util.HashSet;

public class findSubsetArray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 2, 4, 5 };
        /* 1 -> */System.out.println(isSubset(A, B));
        /* 2 -> */System.out.println(isSubSet(A, B));
        /* 3 -> */System.out.println(isSubSSet(A, B));
    }

    private static Boolean isSubset(int A[], int B[]) {
        for (int b : B) {
            boolean found = false;
            for (int a : A) {
                if (b == a) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    private static Boolean isSubSet(int A[], int B[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int a : A) {
            hashSet.add(a);
        }
        for (int b : B) {
            if (!hashSet.contains(b)) {
                return false;
            }
        }
        return true;
    }

    private static Boolean isSubSSet(int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                j++;
            }
            i++;
        }
        return j == B.length;
    }
}
