package Arrays;

//Q.find Intersection and union of two arrays.
import java.util.ArrayList;
import java.util.List;

public class findIntersectionUnion {
    public static void main(String[] args) {
        int A[] = { 1, 2, 4, 5, 6 };
        int B[] = { 2, 3, 5, 7 };
        findUnionAndIntersection(A, B);

    }

    private static void findUnionAndIntersection(int A[], int B[]) {
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != A[i]) {
                    union.add(A[i]);
                }
                i++;
            } else if (A[i] > B[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != B[j]) {
                    union.add(B[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != A[i]) {
                    union.add(A[i]);
                }
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != A[i]) {
                    intersection.add(A[i]);
                }
                i++;
                j++;
            }
        }

        while (i < A.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != A[i]) {
                union.add(A[i]);
            }
            i++;
        }
        while (j < B.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != B[j]) {
                union.add(B[j]);
            }
            j++;
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
