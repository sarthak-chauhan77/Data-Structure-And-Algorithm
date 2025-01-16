package Recursion;

public class practice {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void printN(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printN(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.print(fib(i) + "\t");
        }
        printN(9);

    }
}
