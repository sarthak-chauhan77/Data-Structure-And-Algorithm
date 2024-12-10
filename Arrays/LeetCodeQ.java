package Arrays;

/*
 Q.You are given positive integers n and m, Define two integersnum1 and num2 -->
  >num1: The sum of integers in the range of [1,n] that are not divisible by m.
  >num2: The sum of integers in the range of [1,n] that are divisible by m.
  >Return the integr --> (num1-num2)  !!
 */
public class LeetCodeQ {
    private static int diffrenceOfSum(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        int n = 10, m = 3;
        int diff = diffrenceOfSum(n, m);
        System.out.println("diffrenceOfSum (num1-num2) --> " + diff);
    }
}