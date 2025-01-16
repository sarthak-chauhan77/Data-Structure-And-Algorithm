package Recursion;

import java.util.Scanner;

public class recursion {
    public static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a num:");
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();

        }
        System.out.print("\nThe factorial is:");
        System.out.println(Factorial(num));

    }
}