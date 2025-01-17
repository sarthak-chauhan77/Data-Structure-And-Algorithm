package Recursion;

//Q. print X^n where stack height = n
public class Question1 {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPowerNum1 = calcPower(x, n - 1);
        int xPower = x * xPowerNum1;
        return xPower;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println("Ans:" + calcPower(x, n));
    }
}
